package com.ejercicio7.ejercicio7.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio7.ejercicio7.model.Jugador;

public interface IJugadorRepo extends JpaRepository<Jugador, Long> {
    
}
