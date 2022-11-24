package com.ejerciciorepasoocho.ejerciciorepasoocho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejerciciorepasoocho.ejerciciorepasoocho.model.Inmueble;
import com.ejerciciorepasoocho.ejerciciorepasoocho.service.InmuebleService;

@Controller
public class InmuebleController {
    
    @Autowired
    InmuebleService inmuebleService;

    @GetMapping("/formulario")
    public String formulario(Model model){
        model.addAttribute("inmueble", new Inmueble());
        return "formulario";
    }

    @GetMapping("/guardar")
    public String guardarInmueble(Inmueble inmueble){
        inmuebleService.saveInmueble(inmueble);

        return "redirect:/formulario";
    }
}
