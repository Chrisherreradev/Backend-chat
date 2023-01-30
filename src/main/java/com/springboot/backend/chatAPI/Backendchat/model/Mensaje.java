package com.springboot.backend.chatAPI.Backendchat.model;

import java.io.Serializable;

public class Mensaje implements Serializable {
    private String texto;
    private Long fecha;
    private String username;
    private String tipo;
    private String color;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
