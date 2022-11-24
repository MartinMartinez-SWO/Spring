package com.repasoejercicio4.repasoejercicio4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SecondController {
    

    @GetMapping("/form")
    public String formularioShow() {
        return "form";
    }
    
    @PostMapping("/capturador")
    public String capturador(@RequestParam String username, @RequestParam String email, Model model){
        model.addAttribute("username", username);
        model.addAttribute("email", email);
        return "usuarioEmail";
    }
}
