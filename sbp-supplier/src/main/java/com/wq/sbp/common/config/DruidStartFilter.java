package com.wq.sbp.common.config;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;
/**
 * druid过滤器
 *
 *
 * @author zwq
 * @date 2017年10月16日
 */
@WebFilter(filterName = "druidWebStatFilter",
           urlPatterns = "/*",
           initParams = { @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
           })
public class DruidStartFilter extends WebStatFilter {

}
