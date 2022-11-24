package com.repasobd.repasobd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repasobd.repasobd.model.Alumno;
import com.repasobd.repasobd.repository.IAlumnoRepository;

@Service
public class AlumnoService {
    
    @Autowired
    private IAlumnoRepository alumnoRepository;

    public Alumno findAlumno(Long id){
        return alumnoRepository.findById(id).orElse(null);

    }

    public void saveAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }
}
