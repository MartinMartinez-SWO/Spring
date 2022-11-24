package com.springbd.ejercicio10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbd.ejercicio10.service.ZapatoService;

@Controller
@RequestMapping("/zapateria")
public class ZapatoController {

    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/search/{id}")
    public String mostrarZapato(@PathVariable Long id, Model model) {
        model.addAttribute("zapato", zapatoService.retornarJson(id));
        return "table";
    }
}
