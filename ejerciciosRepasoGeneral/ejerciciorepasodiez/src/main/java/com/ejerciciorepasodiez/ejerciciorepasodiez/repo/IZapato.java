package com.ejerciciorepasodiez.ejerciciorepasodiez.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciorepasodiez.ejerciciorepasodiez.model.Zapato;

@Repository
public interface IZapato extends JpaRepository<Zapato, Long> {
    
}
