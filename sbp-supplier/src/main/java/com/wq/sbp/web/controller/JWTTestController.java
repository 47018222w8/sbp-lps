package com.wq.sbp.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.sbp.common.util.JWTUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Claims;

@RestController
@RequestMapping("/jwt")
public class JWTTestController {

    @GetMapping("/generate")
    public String testGenerate() {
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", 1);
        return JWTUtil.generateToken(map);
    }

    @GetMapping("/volidate")
    public Claims testVolidate(String token) {
        return JWTUtil.getClaimsFromToken(token);
    }
}
