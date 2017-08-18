package com.wq.sbp.common.config;

import java.util.Properties;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.github.pagehelper.PageHelper;
import com.wq.sbp.framework.GlobalInterceptor;

/**
 * 
 *
 *
 * @author zwq
 * @since 2017年8月10日
 */
@Configuration
@ServletComponentScan
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 注册新servlet
     *
     * @return
     *
     * @author zwq
     * @since 2017年8月10日
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new DruidStartViewServlet(), "/druid/*");
    }

    /**
     * 注册新filter
     *
     * @return
     *
     * @author zwq
     * @since 2017年8月10日
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new DruidStartFilter());
        registrationBean.setOrder(2);
        return registrationBean;
    }

    /**
     * 分页
     *
     * @return
     *
     * @author zwq
     * @since 2017年8月10日
     */
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        // 通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
        p.setProperty("pageSizeZero", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

    /**
     * 注册拦截器
     *
     * @param registry
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
     * 
     * @author zwq
     * @since 2017年8月10日
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GlobalInterceptor()).addPathPatterns("/**").excludePathPatterns("/api/1.0/LPS/login/**");
    }

    /**
     * 跨域设置
     *
     * @param registry
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry)
     * 
     * @author zwq
     * @since 2017年7月28日
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(false).allowedHeaders("*").maxAge(3600);
    }
}