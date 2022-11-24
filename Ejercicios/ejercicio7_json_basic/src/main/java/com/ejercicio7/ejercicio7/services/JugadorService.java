package com.ejercicio7.ejercicio7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio7.ejercicio7.model.Jugador;
import com.ejercicio7.ejercicio7.repo.IJugadorRepo;

@Service
public class JugadorService {
    
    @Autowired
    private IJugadorRepo jugadorRepo;
    
    public List<Jugador> listar(){
        return jugadorRepo.findAll();
    }
}
