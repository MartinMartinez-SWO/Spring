package com.springbd.ejercicio9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbd.ejercicio9.model.Zapato;
import com.springbd.ejercicio9.service.ZapatoService;

@RestController
@RequestMapping("/zapateria")
public class ZapatoController {
    
    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/search/{id}")
    public Zapato mostrarZapato(@PathVariable Long id){
        System.out.println(id);
       return zapatoService.retornarJson(id);
    }
}
