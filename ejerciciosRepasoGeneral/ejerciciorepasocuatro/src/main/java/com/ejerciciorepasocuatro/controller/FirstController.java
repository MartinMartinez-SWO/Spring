package com.ejerciciorepasocuatro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    
    @GetMapping("/enlaces")
    public String enlacesVista(){
        return "enlaces";
    }

    @GetMapping("/obtener-enlaces")
    public String capturarEnlaces(@RequestParam Integer id, Model model){
        model.addAttribute("id", id);

        return "resultado";
    }

}
