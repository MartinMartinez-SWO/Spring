package com.ejerciciorepasotres.ejerciciorepasotres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejerciciorepasotres.ejerciciorepasotres.model.Alumno;
import com.ejerciciorepasotres.ejerciciorepasotres.service.Promedio;

@Controller
@RequestMapping({"/", "/alumnos", "/alumnado"})
public class AlumnoController {

    @GetMapping("/mostrar")
    public String agregarAlumnos(Model model){

        Alumno alumno1 = new Alumno(1, "Martin", "Martinez", "Martinez", 10);
        Alumno alumno2 = new Alumno(2, "Emmo", "Carpinterio", "Abalo", 24);
        Alumno alumno3 = new Alumno(3, "Zoilo", "Costacurta", "Hernán", 10);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        model.addAttribute("alumnos", alumnos);

        Promedio media = new Promedio();

        model.addAttribute("media", media.obtenerMedia(alumnos));

        return "alumnosView";
    }

}
