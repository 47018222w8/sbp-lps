package com.wq.sbp.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.CarBrand;

@RestController
public class TestController {
    @PostMapping("/test")
    public String test(@RequestBody CarBrand carBrand,String sign){
        System.out.println(sign);
        return carBrand.toString();
    }
}
