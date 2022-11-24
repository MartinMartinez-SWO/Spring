package com.ejerciciounospring.ejerciciounospring.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroService {
    
    public String parImpar(int num){
        if(num%2==0){
            return "par";
        } else return "impar";
    }

}
