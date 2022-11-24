package com.ejerciciorepasodiez.ejerciciorepasodiez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciorepasodiez.ejerciciorepasodiez.model.Zapato;
import com.ejerciciorepasodiez.ejerciciorepasodiez.repo.IZapato;

@Service
public class ZapatoService {
    
    @Autowired
    IZapato zapatoRepository;

    public Zapato obtenerZapatoId(Long id){
        return zapatoRepository.findById(id).orElse(null);
    }
}
