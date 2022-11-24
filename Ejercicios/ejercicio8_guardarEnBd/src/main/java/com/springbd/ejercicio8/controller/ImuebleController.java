package com.springbd.ejercicio8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbd.ejercicio8.model.Inmueble;
import com.springbd.ejercicio8.service.InmuebleService;

@Controller
@RequestMapping("/inmobiliaria")
public class ImuebleController {
    
    @Autowired
    private InmuebleService inmuebleService;

    @PostMapping("/save-item")
    public String guardar(Inmueble inmueble){
        inmuebleService.save(inmueble);
        return "redirect:/inmobiliaria/home";
    }

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("inmueble", new Inmueble());
        return "form";
    }
}
