package com.wq.sbp.service.impl;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.wq.sbp.service.AsyncService;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

}
