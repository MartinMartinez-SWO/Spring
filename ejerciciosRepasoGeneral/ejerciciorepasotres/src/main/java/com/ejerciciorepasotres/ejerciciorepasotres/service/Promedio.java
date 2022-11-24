package com.ejerciciorepasotres.ejerciciorepasotres.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejerciciorepasotres.ejerciciorepasotres.model.Alumno;

@Service
public class Promedio {
    public float obtenerMedia(List<Alumno> alumnos){
        float notas = 0;
        for (Alumno alumno : alumnos) {
            notas += alumno.getNota();
        }
        return notas/(alumnos.size());
    }

}
