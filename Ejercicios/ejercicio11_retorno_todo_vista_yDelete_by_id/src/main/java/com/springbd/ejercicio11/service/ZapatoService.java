package com.springbd.ejercicio11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbd.ejercicio11.model.Zapato;
import com.springbd.ejercicio11.repo.IZapatoRepo;

@Service
public class ZapatoService {
    
    @Autowired
    private IZapatoRepo zapatoRepo;

    public List<Zapato> retornar(){
       return zapatoRepo.findAll();
    }

    public void borrarEntrada(Long id){
        zapatoRepo.deleteById(id);
    }
}
