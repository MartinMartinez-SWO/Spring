package com.ejercicio7.ejercicio7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio7.ejercicio7.model.Jugador;
import com.ejercicio7.ejercicio7.services.JugadorService;

//@Controller
@RestController
@RequestMapping("/")
public class JugadorController {
    
    @Autowired
    public JugadorService jugadorService;

    @GetMapping("/lista-jugadores")
    public List<Jugador> retornar(){
        return jugadorService.listar();
    
    }
}
