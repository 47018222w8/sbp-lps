package com.wq.sbp.common.config;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;
import com.wq.sbp.common.constants.Constants;
/**
 * druid servlet
 *
 *
 * @author zwq
 * @since 2017年10月16日
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*",
            initParams = { @WebInitParam(name = "loginUsername", value = Constants.ADMIN_ACOUNT),// 用户名
                           @WebInitParam(name = "loginPassword", value = Constants.ADMIN_PWD),// 密码
                           @WebInitParam(name = "resetEnable", value = "false")// 禁用HTML页面上的“Reset All”功能
            })
public class DruidStartViewServlet extends StatViewServlet {

}
