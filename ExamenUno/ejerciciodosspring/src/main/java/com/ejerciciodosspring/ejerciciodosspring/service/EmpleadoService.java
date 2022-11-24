package com.ejerciciodosspring.ejerciciodosspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciodosspring.ejerciciodosspring.model.Empleado;
import com.ejerciciodosspring.ejerciciodosspring.repo.IEmpleado;

@Service
public class EmpleadoService {
    
    @Autowired
    public IEmpleado empleadoRepo;

    //método para retornar todos los empleados
    public List<Empleado> devolverEmpleados(){
        return empleadoRepo.findAll();
    }

    //devolver un empleado en funcion del id
    public Empleado  empleadoPorId (Long id){
        return empleadoRepo.findById(id).orElse(null);
    }

    //devolver empleado que coincida con una url manual
      public List<Empleado> empleadoPorEmail(String email){
          return empleadoRepo.findByEmail(email);
      }
    }

