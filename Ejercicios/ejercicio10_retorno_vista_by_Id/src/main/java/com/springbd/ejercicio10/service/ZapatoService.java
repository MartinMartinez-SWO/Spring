package com.springbd.ejercicio10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbd.ejercicio10.model.Zapato;
import com.springbd.ejercicio10.repo.IZapatoRepo;

@Service
public class ZapatoService {
    
    @Autowired
    private IZapatoRepo zapatoRepo;

    public Zapato retornarJson(Long id){
       return zapatoRepo.findById(id).orElse(null);
    }
}
