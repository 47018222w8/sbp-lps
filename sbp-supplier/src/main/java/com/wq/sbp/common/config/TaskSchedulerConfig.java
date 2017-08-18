package com.wq.sbp.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 开启定时任务支持(单线程的)
 *
 *
 * @author zwq
 * @since 2017年8月10日
 */
@Configuration
@EnableScheduling
public class TaskSchedulerConfig {

}
