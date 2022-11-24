package com.springbd.ejercicio9.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbd.ejercicio9.model.Zapato;

public interface IZapatoRepo extends JpaRepository<Zapato,Long> {
    
}
