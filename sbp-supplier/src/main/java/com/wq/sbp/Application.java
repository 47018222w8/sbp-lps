package com.wq.sbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 入口 ,含@ComponentScan自动扫描同级包
 *
 *
 * @author zwq
 * @since 2017年10月16日
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
