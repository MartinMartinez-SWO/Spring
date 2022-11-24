package com.ejerciciorepasonueve.ejerciciorepasonueve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciorepasonueve.ejerciciorepasonueve.model.Zapato;
import com.ejerciciorepasonueve.ejerciciorepasonueve.repo.IZapato;

@Service
public class ZapatoService {
    
    @Autowired
    IZapato zapatoRepository;

    public Zapato obtenerZapatoId(Long id){
        return zapatoRepository.findById(id).orElse(null);
    }
}
