package com.wq.sbp.framework;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.PropertyService;

/**
 * 启动加载
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Component
public class StartUpRunner implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(StartUpRunner.class);

    @Resource
    private RedisTemplate<String, ?> redisTemplate;

    @Autowired
    private PropertyService propertyServcie;

    @Autowired
    private CarBrandServcie carBrandServcie;

    @Override
    public void run(String... arg0) throws Exception {
        redisTemplate.delete(Constants.CACHE_QUALITY_PROPERTY);
        propertyServcie.listPropertyLJPJ();
        log.info("缓存零件品质结束");
        redisTemplate.delete(Constants.CACHE_CAR_BRAND_SORT);
        carBrandServcie.listCarBrandGroupByLetter();
        log.info("缓存车辆品牌结束");
    }

}
