package com.ejerciciorepasosiete.ejerciciorepasosiete.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciorepasosiete.ejerciciorepasosiete.model.Jugador;
import com.ejerciciorepasosiete.ejerciciorepasosiete.repo.IJugador;

@Service
public class JugadorService {

    @Autowired
    IJugador jugadorRepository;

    public List<Jugador> recuperar(){
        return jugadorRepository.findAll();
    }
    
}
