package com.springbd.ejercicio11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbd.ejercicio11.service.ZapatoService;

@Controller
@RequestMapping("/zapateria")
public class ZapatoController {

    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/lista")
    public String mostrarZapato(Model model) {
        model.addAttribute("zapatos", zapatoService.retornar());
        return "table";
    }

    @GetMapping("/delete/{id}")
        public String borrarZapato(@PathVariable Long id){
            zapatoService.borrarEntrada(id);
            return "redirect:/zapateria/lista";
    }
}
