package com.ejercicio6.ejercicio6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejercicio6.ejercicio6.model.Coche;
import com.ejercicio6.ejercicio6.service.ConcheService;

@Controller
@RequestMapping("/concesionario")
public class CocheController {

    @Autowired
    private ConcheService cochesService;

    @GetMapping("/anhadir")
    public String saveCoche(Coche coche) {
        cochesService.saveCoche(coche);
        return "redirect:/concesionario/home";
    }

    @GetMapping("/search")
    public String recuperar(Model model) {
        model.addAttribute("coches", cochesService.recuperarCoches());
        return "resultado";
    }

    @GetMapping("/home")
    public String form(Model model) {
        model.addAttribute("coche", new Coche());
        return "form";
    }
}
