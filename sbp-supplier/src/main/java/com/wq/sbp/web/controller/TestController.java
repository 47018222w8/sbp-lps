package com.wq.sbp.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.CarBrandDO;

/**
 * 测试
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@RestController
public class TestController {

    @PostMapping("/test")
    public String test(@RequestBody CarBrandDO carBrand, String sign) {
        System.out.println(sign);
        return carBrand.toString();
    }
}
