package com.ejerciciorepasosiete.ejerciciorepasosiete.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejerciciorepasosiete.ejerciciorepasosiete.model.Jugador;

public interface IJugador extends JpaRepository<Jugador, Integer> {
    
}
