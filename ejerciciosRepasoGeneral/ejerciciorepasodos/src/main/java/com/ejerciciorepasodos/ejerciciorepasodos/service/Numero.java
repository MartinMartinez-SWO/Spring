package com.ejerciciorepasodos.ejerciciorepasodos.service;

import org.springframework.stereotype.Service;

@Service
public class Numero {
    
    public int numeroAleatorio(){
        int aleatorio = (int) (Math.random()*10);
        return aleatorio;
    }

}
