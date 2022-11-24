package com.springbd.ejercicio8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbd.ejercicio8.model.Inmueble;
import com.springbd.ejercicio8.repo.IInmuebleRepo;

@Service
public class InmuebleService {
    
    @Autowired
    public IInmuebleRepo inmuebleRepo;

    public Inmueble save(Inmueble inmueble){
        return inmuebleRepo.save(inmueble);
    }
}
