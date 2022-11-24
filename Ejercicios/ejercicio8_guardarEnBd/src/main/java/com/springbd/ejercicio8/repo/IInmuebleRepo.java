package com.springbd.ejercicio8.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbd.ejercicio8.model.Inmueble;

@Repository
public interface IInmuebleRepo extends JpaRepository<Inmueble, Long> {
    
}
