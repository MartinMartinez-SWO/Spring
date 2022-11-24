package com.ejerciciorepasosiete.ejerciciorepasosiete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejerciciorepasosiete.ejerciciorepasosiete.model.Jugador;
import com.ejerciciorepasosiete.ejerciciorepasosiete.service.JugadorService;

@RestController
public class JugadorController {
    
    @Autowired
    JugadorService jugadorService;

    @GetMapping("/datos")
    public List<Jugador> devolverJson(){
        return jugadorService.recuperar();
    } 
}
