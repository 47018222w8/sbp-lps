package com.wq.sbp.common.util;

import org.sbp.common.model.CommonConstants;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * rabbitmq接收者,用来测试的
 * @author zwq
 * @date 2017年10月16日
 */
@Component
@Profile("own")
@RabbitListener(queues = CommonConstants.RABBITMQ_WX_QUEUE)
public class Reciver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver1  : " + message);
    }
}
