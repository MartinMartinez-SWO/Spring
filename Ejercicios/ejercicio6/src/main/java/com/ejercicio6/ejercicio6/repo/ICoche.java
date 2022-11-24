package com.ejercicio6.ejercicio6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio6.ejercicio6.model.Coche;



public interface ICoche extends JpaRepository<Coche, Long> {
    
}
