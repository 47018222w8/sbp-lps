package com.wq.sbp.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//@EnableWebSocket
//@Configuration
public class WebsocketConfig implements WebSocketConfigurer{

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler(), "/socket").setAllowedOrigins("*").withSockJS();
    }
    @Bean
    public WebSocketHandler webSocketHandler(){
        return new WebSocketHandler();
    }
}
