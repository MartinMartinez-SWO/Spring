package com.ejerciciodosspring.ejerciciodosspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejerciciodosspring.ejerciciodosspring.model.Empleado;
import com.ejerciciodosspring.ejerciciodosspring.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    public EmpleadoService empleadoService;

    @GetMapping("/lista")
    public List<Empleado> retornoTodo(){
        
        return empleadoService.devolverEmpleados();
    }

    @GetMapping("/{id}")
    public Empleado retornarPorId(@PathVariable Long id){
        return empleadoService.empleadoPorId(id);
    }

     @GetMapping("/por-email/{email}")
     public List<Empleado> retornarPorEmail(@PathVariable String email){
         return empleadoService.empleadoPorEmail(email);
     }
}
