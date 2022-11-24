package com.repasoejercicio4.repasoejercicio4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    
    @GetMapping("/enlaces")
    public String enlaces(){
        return "enlaces";
    }


    @GetMapping("/mostrarNumeros")
    public String mostrar(@RequestParam String id, Model model){

        model.addAttribute("id", id);

        return "resultado";
    }
}
