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
 * @date 2017年7月2日
 */
public class CreateBeanTest {

    private String tablename = "t_car_part_sort";

    /**
     * 不写默认驼峰
     * @author zwq
     */
    private String modelName = "CarPartSortDO";

    private String modelOutPath = "com.wq.sbp.model";

    private String authName = "zwq";

    /**
     * 列名数组
     * @author zwq
     */
    private String[] colNames;

    /**
     * 列名类型数组
     * @author zwq
     * 
     */
    private String[] colTypes;

    /**
     * 备注
     * @author zwq
     */
    private String[] colRemarks;

    private String url = "jdbc:mysql://192.168.1.254:3306/eauto100?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";

    private String user = "root";

    private String pwd = "123456";

    @Test
    public void createBeanTest() {
        CreateBeanTest createBean = new CreateBeanTest();
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

    /**
     * 
     *
     *
     * @author zwq
     * @since 2017年10月16日
     */
    public void createBeanMethod() {
        Connection conn = getConnection();
        String strsql = "select * from " + tablename;
        PreparedStatement pstmt = null;
        ResultSetMetaData rsmd = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(strsql);
            rsmd = pstmt.getMetaData();
            rs = conn.getMetaData().getColumns(null, "", tablename, "%");
            int size = rsmd.getColumnCount(); 
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
        sb.append("\r\n");
        // 注释部分
        sb.append("/**\r\n");
        sb.append(" * " + initcap(tablename) + " 实体类\r\n");
        sb.append(" * @date " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "\r\n");
        sb.append(" * @author " + authName + "\r\n");
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
     * 生成所有方法
     *
     * @param sb
     *
     * @author zwq
     * @since 2017年10月16日
     */
    private void processAllMethod(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
            // set
            sb.append("\tpublic " + modelName + " set" + initcap(colNames[i])
                    + "("
                    + sqlType2JavaType(colTypes[i])
                    + " "
                    + defineVar(colNames[i])
                    + "){\r\n");
            sb.append("\t\tthis." + this.defineVar(colNames[i]) + "=" + this.defineVar(colNames[i]) + ";\r\n");
            sb.append("\t\treturn this;\r\n");
            sb.append("\t}\r\n");
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
            sb.append("\t/**\r\n");
            sb.append("\t * " + colRemarks[i] + " \r\n");
            sb.append("\t * @author " + authName + " \r\n");
            sb.append("\t */ \r");
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
        int small= 96;
        if (charArry[0] > small) {
            charArry[0] = (char) (charArry[0] - 32);
        }

        str = new String(charArry).replace("_", "");
        return str;
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
        default:
            return "String";
        }

    }

}
