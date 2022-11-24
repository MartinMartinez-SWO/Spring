package com.ejerciciorepasoocho.ejerciciorepasoocho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciorepasoocho.ejerciciorepasoocho.model.Inmueble;
import com.ejerciciorepasoocho.ejerciciorepasoocho.repo.IInmueble;

@Service
public class InmuebleService {
    

    @Autowired
    IInmueble inmuebleRepo;

    public void saveInmueble(Inmueble inmueble){
        inmuebleRepo.save(inmueble);
    }
}
