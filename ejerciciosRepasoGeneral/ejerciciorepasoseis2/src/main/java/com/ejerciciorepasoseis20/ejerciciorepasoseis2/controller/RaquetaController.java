package com.ejerciciorepasoseis20.ejerciciorepasoseis2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejerciciorepasoseis20.ejerciciorepasoseis2.model.Raqueta;
import com.ejerciciorepasoseis20.ejerciciorepasoseis2.service.RaquetaService;

@Controller
public class RaquetaController {

    @Autowired
    RaquetaService raquetaService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("raqueta", new Raqueta());
        return "home";
    }

    @GetMapping("/send")
    public String send(Raqueta raqueta) {
        raquetaService.guardarRaquetas(raqueta);

        return "redirect:/home";
    }

    @GetMapping("/recuperar")
    public String retrieve(Model model) {
        model.addAttribute("raquetas", raquetaService.recuperarRaquetas());
        return "tabla";
    }
}
