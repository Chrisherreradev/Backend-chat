package com.springboot.backend.chatAPI.Backendchat.model.service;

import com.springboot.backend.chatAPI.Backendchat.model.Mensaje;

import java.util.List;

public interface ChatService {
    public List<Mensaje> obtenerUltimos10Mensajes();
    public Mensaje guardar(Mensaje mensaje);
}
