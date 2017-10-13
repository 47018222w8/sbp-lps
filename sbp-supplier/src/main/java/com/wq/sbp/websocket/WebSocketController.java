package com.wq.sbp.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private Logger logger = LoggerFactory.getLogger(WebSocketController.class);

    @MessageMapping("/marco")
    public void handleShout(Shout incoming) {
        logger.info("---------------------------");
        logger.info("-------------------------------------------"+incoming.getMessage());
    }
}
