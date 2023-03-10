package com.springboot.backend.chatAPI.Backendchat.controller;

import com.springboot.backend.chatAPI.Backendchat.model.Mensaje;
import com.springboot.backend.chatAPI.Backendchat.model.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class ChatController {
    private String[] colores = {"red", "green", "blue","magenta","purple", "orange", "cyan"};

    @Autowired
    private ChatService chatService;

    @Autowired
    private SimpMessagingTemplate webSocket;

    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje){
        mensaje.setFecha(new Date().getTime());

        if (mensaje.getTipo().equals("NUEVO_USUARIO")){
            mensaje.setColor(colores[new Random().nextInt(colores.length)]);
            mensaje.setTexto("nuevo usuario");
        } else{
            chatService.guardar(mensaje);
        }

        return mensaje;

    }

    @MessageMapping("/escribiendo")
    @SendTo("/chat/escribiendo")
    public String estaEscribiendo(String username){
        return username.concat(" està escribiendo...");
    }

    @MessageMapping("/historial")
    public void historial(String clienteId){
        webSocket.convertAndSend("/chat/historial/"+clienteId, chatService.obtenerUltimos10Mensajes());
    }
}
