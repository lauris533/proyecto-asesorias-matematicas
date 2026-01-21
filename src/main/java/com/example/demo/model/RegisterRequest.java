package com.example.demo.model;

/**
 * Modelo de datos para registro de usuario
 * Evidencia GA7-220501096-AA5-EV03
 */
public class RegisterRequest {

    private String usuario;
    private String password;
    private String correo;

    public RegisterRequest() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
