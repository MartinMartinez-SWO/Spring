package com.ejerciciorepasonueve.ejerciciorepasonueve.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciorepasonueve.ejerciciorepasonueve.model.Zapato;

@Repository
public interface IZapato extends JpaRepository<Zapato, Long> {
    
}
