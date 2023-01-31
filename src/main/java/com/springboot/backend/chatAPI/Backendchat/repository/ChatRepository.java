package com.springboot.backend.chatAPI.Backendchat.repository;

import com.springboot.backend.chatAPI.Backendchat.model.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatRepository extends MongoRepository<Mensaje, String> {
    public List<Mensaje> findFirst10ByOrderByFechaDesc();
}
