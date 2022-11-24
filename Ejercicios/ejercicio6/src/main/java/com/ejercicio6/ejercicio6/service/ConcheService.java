package com.ejercicio6.ejercicio6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio6.ejercicio6.model.Coche;
import com.ejercicio6.ejercicio6.repo.ICoche;

@Service
public class ConcheService {
    
    @Autowired
    public ICoche cocheRepo;

    public List<Coche> recuperarCoches(){
        return cocheRepo.findAll();
    }

    public void saveCoche(Coche coche){
        cocheRepo.save(coche);
    }

}
