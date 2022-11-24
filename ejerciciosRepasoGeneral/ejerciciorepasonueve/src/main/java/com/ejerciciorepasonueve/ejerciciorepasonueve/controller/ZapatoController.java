package com.ejerciciorepasonueve.ejerciciorepasonueve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ejerciciorepasonueve.ejerciciorepasonueve.model.Zapato;
import com.ejerciciorepasonueve.ejerciciorepasonueve.service.ZapatoService;

@RestController
public class ZapatoController {
    
    @Autowired
    ZapatoService zapatoService;

    @GetMapping("/zapatos/{id}")
    public Zapato devolverZapato(@PathVariable Long id){
        return zapatoService.obtenerZapatoId(id);
    }
}
