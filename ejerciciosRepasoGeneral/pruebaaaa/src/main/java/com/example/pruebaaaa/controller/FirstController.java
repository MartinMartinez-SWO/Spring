package com.example.pruebaaaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/primero")
public class FirstController {
    
    @GetMapping("/enlaces-vista")
    public String enlacesVista(){
        return "enlaces";
    }

    @GetMapping("/obtener-enlaces")
    public String capturarEnlaces(@RequestParam Integer id, Model model){
        model.addAttribute("id", id);

        return "renderizado";
    }

}
