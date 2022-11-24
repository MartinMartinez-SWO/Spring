package com.springbd.ejercicio10.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbd.ejercicio10.model.Zapato;

public interface IZapatoRepo extends JpaRepository<Zapato,Long> {
    
}
