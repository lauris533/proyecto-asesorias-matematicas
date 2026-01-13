package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador del módulo de prueba
 * Evidencia GA7-AA3-EV01
 */
@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo() {
        return "El módulo del proyecto funciona correctamente";
    }
}

