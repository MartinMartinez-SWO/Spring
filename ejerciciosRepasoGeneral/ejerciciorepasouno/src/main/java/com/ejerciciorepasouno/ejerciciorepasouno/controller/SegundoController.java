package com.ejerciciorepasouno.ejerciciorepasouno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SegundoController {
    
    @GetMapping("/segundo-metodo")
    public String segundoMetodo(){
        return "secondView";
    }
}
