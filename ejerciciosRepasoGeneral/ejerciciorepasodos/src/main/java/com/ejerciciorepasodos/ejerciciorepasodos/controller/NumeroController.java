package com.ejerciciorepasodos.ejerciciorepasodos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejerciciorepasodos.ejerciciorepasodos.service.Numero;

@Controller
public class NumeroController {

    @GetMapping("/envio-numero") // -> localhost:8080/envio-numero
    public String numeroAleatorio(Model model) {
        

        Numero numero = new Numero();
        int aleatorio = numero.numeroAleatorio();

        model.addAttribute("aleatorio", aleatorio);

        return "randomView";
    }
}
