package com.ejerciciorepasoseis20.ejerciciorepasoseis2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejerciciorepasoseis20.ejerciciorepasoseis2.model.Raqueta;
import com.ejerciciorepasoseis20.ejerciciorepasoseis2.repo.IRaqueta;

@Service
public class RaquetaService {
    
    @Autowired
    IRaqueta raquetaRepo;

    public Raqueta guardarRaquetas(Raqueta raqueta){
        return raquetaRepo.save(raqueta);
    }

    public List<Raqueta> recuperarRaquetas(){
        return raquetaRepo.findAll();
    }
}
