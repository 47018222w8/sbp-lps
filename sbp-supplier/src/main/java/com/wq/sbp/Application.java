package com.wq.sbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// 含@ComponentScan自动扫描同级包
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
