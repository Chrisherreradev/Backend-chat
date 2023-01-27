package com.springboot.backend.chatAPI.Backendchat.model;

import java.io.Serializable;

public class Mensaje implements Serializable {
    private String texto;
    private Long fecha;

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    private static final long serialVersionUID = -3777582564067492550L;
}
