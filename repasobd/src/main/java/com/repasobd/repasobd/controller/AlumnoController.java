package com.repasobd.repasobd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repasobd.repasobd.model.Alumno;
import com.repasobd.repasobd.service.AlumnoService;


//@RestController //para en vez de devolver una vista, devolver un json
@Controller
@RequestMapping("/alumno")
public class AlumnoController {
    
        @Autowired
        private AlumnoService alumnoService;

        @GetMapping("/search/{id}")
        public String findStudent(@PathVariable Long id, Model model){
            model.addAttribute("alumno", alumnoService.findAlumno(id));
            return "form";
        }

        @PostMapping("/save")
        public String saveStudent(Alumno alumno){
            alumnoService.saveAlumno(alumno);
            return "redirect:/home";
        }

        @GetMapping("/home")
        public String home(){
            return "home";
        }
}
