package com.wq.sbp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.wq.sbp.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    Logger log = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Scheduled(fixedRate = 2000) // 每2秒执行
    @Override
    public void test() {
        //log.info("second:" + LocalTime.now().getSecond());
    }
}
