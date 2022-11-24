package com.springbd.ejercicio11.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbd.ejercicio11.model.Zapato;

public interface IZapatoRepo extends JpaRepository<Zapato,Long> {
    
}
