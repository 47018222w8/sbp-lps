package com.wq.sbp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.PropertyDao;
import com.wq.sbp.model.Property;
import com.wq.sbp.service.AsyncService;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Resource
    private PropertyDao propertyDao;

    @Override
    public void cacheQualityProperty() {
        List<Property> propertys = propertyDao.selectPropertyChildListByCode("ljpz");
        List<Property> ps = new ArrayList<Property>();
        for (Property p : propertys) {
            List<Property> sons = propertyDao.selectPropertyChildListByCode(p.getPropertyCode());
            if (sons != null && sons.size() > 0) {
                ps.addAll(sons);
            }
        }
        redisTemplate.opsForValue().set(Constants.CACHE_QUALITY_PROPERTY, JSON.toJSONString(ps));
    }

}
