package com.wq.sbp.service.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.PropertyDao;
import com.wq.sbp.model.Property;
import com.wq.sbp.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyDao propertyDao;

    @Resource
    private RedisTemplate<String, Property> redisTemplate;

    @Override
    public List<Property> listPropertyLJPJ() {
        List<Property> result = redisTemplate.opsForList().range(Constants.CACHE_QUALITY_PROPERTY, 0, -1);
        if(result == null || result.isEmpty()){
            List<Property> propertys = propertyDao.listPropertyChildByCode("ljpz");
            result = new LinkedList<>();
            for (Property p : propertys) {
                List<Property> sons = propertyDao.listPropertyChildByCode(p.getPropertyCode());
                if (sons != null && !sons.isEmpty()) {
                    result.addAll(sons);
                }
            }
            redisTemplate.opsForList().rightPushAll(Constants.CACHE_QUALITY_PROPERTY, result);
        }
        return result;
    }

}
