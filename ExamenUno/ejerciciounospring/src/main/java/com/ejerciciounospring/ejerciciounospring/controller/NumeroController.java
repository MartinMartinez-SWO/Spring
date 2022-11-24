package com.ejerciciounospring.ejerciciounospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ejerciciounospring.ejerciciounospring.service.NumeroService;

@Controller
public class NumeroController {


    @GetMapping("/par-impar/{num}")
    public String resultado(@PathVariable int num ,Model model){
        NumeroService calcular = new NumeroService();

        model.addAttribute("numero", calcular.parImpar(num));
        return "resultado";
    }
}
