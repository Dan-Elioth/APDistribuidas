package com.example.websocketserver.controller;

import com.example.websocketserver.model.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MensajeController {
    @MessageMapping("/saludo")
        @SendTo("destino/mensaje")
        public Mensaje saludo(Mensaje mensaje) throws Exception {
            Thread.sleep(100);
            return mensaje;
    }
}
