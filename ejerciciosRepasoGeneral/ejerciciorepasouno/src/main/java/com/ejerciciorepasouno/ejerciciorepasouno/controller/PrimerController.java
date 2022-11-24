package com.ejerciciorepasouno.ejerciciorepasouno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/primer-controller")
public class PrimerController {
    
@GetMapping("/primer-metodo")
public String primerMetodo(){

    return "firstView";
}

}
