package com.example.demo.service;

import com.example.demo.model.LoginRequest;
import com.example.demo.model.RegisterRequest;
import org.springframework.stereotype.Service;

/**
 * Servicio de autenticación
 * Evidencia GA7-220501096-AA5-EV03
 */
@Service
public class AuthService {

    public String login(LoginRequest request) {

        if ("admin".equals(request.getUsuario()) &&
                "1234".equals(request.getPassword())) {

            return "Autenticación satisfactoria";
        }
        return "Credenciales incorrectas";
    }

    public String register(RegisterRequest request) {
        return "Usuario registrado correctamente";
    }
}
