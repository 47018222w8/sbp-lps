package com.wq.sbp.common.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
 * 生成数据库对应的实体类
 * 
 *
 *
 * @author zwq
 * @since 2017年7月2日
 */
public class CreateBean {

    private String tablename = "ibs_report_price_info";

    // 不写默认为驼峰
    private String modelName = "ReportPriceInfo";

    private String modelOutPath = "com.wq.sbp.model";

    private String[] colNames; // 列名数组

    private String[] colTypes; // 列名类型数组

    private String[] colRemarks;// 备注

    private boolean f_util = false; // 是否需要导入包java.util.*

    private String url = "jdbc:mysql://192.168.1.254:3306/eauto100?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";

    private String user = "root";

    private String pwd = "123456";

    public static void main(String[] args) {
        CreateBean createBean = new CreateBean();
        createBean.createBeanMethod();
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void createBeanMethod() {
        Connection conn = getConnection(); // 得到数据库连接
        // myDB为数据库名
        String strsql = "select * from " + tablename;
        PreparedStatement pstmt = null;
        ResultSetMetaData rsmd = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(strsql);
            rsmd = pstmt.getMetaData();
            rs = conn.getMetaData().getColumns(null, "", tablename, "%");
            int size = rsmd.getColumnCount(); // 共有多少列
            colNames = new String[size];
            colTypes = new String[size];
            colRemarks = new String[size];
            List<String> list = new LinkedList<>();
            while (rs.next()) {
                String remark = rs.getString("REMARKS");
                list.add(StringUtils.isEmpty(remark) ? "这家伙很懒,没有留下注释" : remark);
            }
            for (int i = 0; i < size; i++) {
                colRemarks[i] = list.get(i);
            }
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                colNames[i] = rsmd.getColumnName(i + 1);
                colTypes[i] = rsmd.getColumnTypeName(i + 1);
                if (colTypes[i].equalsIgnoreCase("datetime") || colTypes[i].equalsIgnoreCase("DATE")
                        || colTypes[i].equalsIgnoreCase("TIMESTAMP")) {
                    f_util = true;
                }
            }
            String contentModel = parseModel();
            try {
                File directory = new File("");
                String outputPath = directory.getAbsolutePath() + "/src/main/java/"
                        + this.modelOutPath.replace(".", "/")
                        + "/"
                        + (StringUtils.isEmpty(modelName) ? initcap(tablename) : modelName)
                        + ".java";
                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(contentModel);
                pw.flush();
                pw.close();
                System.out.println("生成完毕");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                pstmt.close();
                conn.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 解析处理(生成实体类主体代码)
     */
    private String parseModel() {
        StringBuffer sb = new StringBuffer();
        sb.append("package " + this.modelOutPath + ";\r\n");
        if (f_util) {
            sb.append("import java.util.Date;\r\n");
        }
        sb.append("\r\n");
        // 注释部分
        sb.append("/**\r\n");
        sb.append(" * " + initcap(tablename) + " 实体类\r\n");
        sb.append(" * " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "\r\n");
        sb.append(" */ \r\n");
        // 实体部分

        sb.append("public class " + (StringUtils.isEmpty(modelName) ? initcap(tablename) : modelName) + " {\r\n");
        // 属性
        processAllAttrs(sb);
        // 方法
        processAllMethod(sb);
        sb.append("}\r\n");
        return sb.toString();

    }

    /**
     * 生成所有的方法
     * 
     * @param sb
     */
    private void processAllMethod(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
            // 注释部分
            sb.append("\t/**\r\n");
            sb.append("\t * " + colRemarks[i] + " \r\n");
            sb.append("\t */ \r\n");
            // set
            sb.append("\tpublic void set" + initcap(colNames[i])
                    + "("
                    + sqlType2JavaType(colTypes[i])
                    + " "
                    + defineVar(colNames[i])
                    + "){\r\n");
            sb.append("\t\tthis." + this.defineVar(colNames[i]) + "=" + this.defineVar(colNames[i]) + ";\r\n");
            sb.append("\t}\r\n");
            // 注释部分
            sb.append("\t/**\r\n");
            sb.append("\t * " + colRemarks[i] + " \r\n");
            sb.append("\t */ \r\n");
            // get
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initcap(colNames[i]) + "(){\r\n");
            sb.append("\t\treturn " + defineVar(colNames[i]) + ";\r\n");
            sb.append("\t}\r\n");
        }
    }

    /**
     * 功能：生成所有属性
     * 
     * @param sb
     */
    private void processAllAttrs(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
            sb.append("\r\n\t // " + colRemarks[i]);
            sb.append("\r\n\tprivate " + sqlType2JavaType(colTypes[i]) + " " + defineVar(colNames[i]) + ";\r\n");
        }
    }

    /**
     * 驼峰(首字母小写)
     * 
     * @param str
     * @return
     */
    private String defineVar(String str) {
        char[] charArry = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArry.length; i++) {
            if ((charArry[i] == 95) && (i + 1 < charArry.length) && charArry[i + 1] > 96) {
                charArry[i + 1] = (char) (charArry[i + 1] - 32);
            }
        }
        str = new String(charArry).replace("_", "");
        return str;
    }

    /**
     * 驼峰(首字母大写)
     * 
     * @param str
     * @return
     */
    private String initcap(String str) {
        char[] charArry = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArry.length; i++) {
            if ((charArry[i] == 95) && (i + 1 < charArry.length) && charArry[i + 1] > 96) {
                charArry[i + 1] = (char) (charArry[i + 1] - 32);
            }
        }
        if (charArry[0] > 96) {
            charArry[0] = (char) (charArry[0] - 32);
        }

        str = new String(charArry).replace("_", "");
        return str;
    }

    @Test
    public void testInitcap() {
    }

    /**
     * 功能：获得列的数据类型
     * 
     * @param sqlType
     * @return
     */
    private String sqlType2JavaType(String sqlType) {
        switch (sqlType.toUpperCase()) {
        case "BIT":
            return "byte[]";
        case "TINYINT":

            return "Integer";
        case "SMALLINT":

            return "Integer";
        case "MEDIUMINT":

            return "Integer";
        case "INT":

            return "Integer";
        case "INTEGER":

            return "Integer";
        case "BIGINT":

            return "Long";
        case "FLOAT":

            return "FLOAT";
        case "DOUBLE":

            return "DOUBLE";
        case "DECIMAL":

            return "BigDecimal";
        case "DATE":

            return "Date";
        case "DATETIME":

            return "Date";
        case "TIMESTAMP":

            return "Date";
        case "YEAR":

            return "Date";
        case "CHAR":

            return "String";
        case "VARCHAR":

            return "String";
        case "BINARY":

            return "byte[]";
        case "VARBINARY":

            return "byte[]";
        case "TINYBLOB":

            return "byte[]";
        case "BLOB":

            return "byte[]";
        case "MEDIUMBLOB":

            return "byte[]";
        case "LONGBLOB":

            return "byte[]";
        }
        return "String";
    }

}
