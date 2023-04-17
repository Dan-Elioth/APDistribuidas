package com.involveininnovation.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {  // ruta de inicio para toda la conexion
        registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS(); // permite la solicitud de todos los origene diferente
        //habilitar en uso compartido de recursos de origen 
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) { //intermediario de mensajes
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/chatroom","/user");
        registry.setUserDestinationPrefix("/user");
    }
}
