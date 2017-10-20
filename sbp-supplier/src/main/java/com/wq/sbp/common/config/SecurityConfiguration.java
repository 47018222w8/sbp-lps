package com.wq.sbp.common.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.wq.sbp.common.constants.Constants;

/**
 * 
 * @Description spring 权限管理
 * @author zwq
 * @date 2017年10月16日
 */
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    /**
     * 配置user-detail服务
     * 
     * @param auth
     * @throws Exception
     */
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser(Constants.ADMIN_ACOUNT).password(Constants.ADMIN_PWD).roles("ADMIN");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        // 因使用jwt,取消跨域伪造验证
        http.csrf().disable().httpBasic().and().authorizeRequests().antMatchers("/swagger-ui.html").hasRole("ADMIN").anyRequest()
                .permitAll();
    }

}
