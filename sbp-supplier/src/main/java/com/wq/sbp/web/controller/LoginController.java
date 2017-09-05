package com.wq.sbp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.MemberDO;
import com.wq.sbp.model.ReturnVO;
import com.wq.sbp.service.LoginServie;

@RestController
@RequestMapping("/api/1.0/LPS/login")
public class LoginController {

    @Autowired
    private LoginServie loginServie;

    /**
     * 登录
     *
     * @param member
     * @return
     *
     * @author zwq
     * @since 2017年8月18日
     */
    @PostMapping("/validate")
    public ReturnVO login(@RequestBody MemberDO member) {
        return loginServie.login(member);
    }
}
