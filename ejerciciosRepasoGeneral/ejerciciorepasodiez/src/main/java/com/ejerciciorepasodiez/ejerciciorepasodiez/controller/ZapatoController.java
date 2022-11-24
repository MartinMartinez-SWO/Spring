package com.ejerciciorepasodiez.ejerciciorepasodiez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ejerciciorepasodiez.ejerciciorepasodiez.service.ZapatoService;

@Controller
public class ZapatoController {
    
    @Autowired
    ZapatoService zapatoService;

    @GetMapping("/zapatos/{id}")
    public String devolverZapato(@PathVariable Long id, Model model){
        model.addAttribute("zapato", zapatoService.obtenerZapatoId(id));
        return "table";
    }
}
