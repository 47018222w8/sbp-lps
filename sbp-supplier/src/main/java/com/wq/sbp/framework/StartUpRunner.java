package com.wq.sbp.framework;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wq.sbp.service.AsyncService;

/**
 * 启动加载
 *
 *
 * @author zwq
 * @since 2017年7月31日
 */
@Component
public class StartUpRunner implements CommandLineRunner {

    @Resource
    private AsyncService asyncService;

    @Override
    public void run(String... arg0) throws Exception {
    }

}
