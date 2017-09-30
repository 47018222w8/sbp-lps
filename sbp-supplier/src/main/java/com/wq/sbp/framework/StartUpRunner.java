package com.wq.sbp.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.PropertyService;

/**
 * 启动加载
 *
 *
 * @author zwq
 * @since 2017年7月31日
 */
@Component
public class StartUpRunner implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(StartUpRunner.class);

    @Autowired
    private PropertyService propertyServcie;

    @Autowired
    private CarBrandServcie carBrandServcie;

    @Override
    public void run(String... arg0) throws Exception {
        propertyServcie.savePropertyListLJPJToRedis();
        log.info("缓存零件品质结束");
        carBrandServcie.saveCarBrandByLetterToRedis();
        log.info("缓存车辆品牌结束");
    }

}
