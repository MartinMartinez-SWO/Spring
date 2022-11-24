package com.example.pruebaaaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/segundo")
public class SecondController {
    
    @GetMapping("/form")
    public String formulario(){

        return "form";
    }

    @GetMapping("/capturador")
    public String capturador(@RequestParam String username, @RequestParam String email, Model model){
        model.addAttribute("username", username);
        model.addAttribute("email", email);

        return "resultForm";
    }
}
    