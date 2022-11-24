package com.repasoejerciciocinco.repasoejerciciocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/form")
    public String formulario(){
        return "form";
    }

    @PostMapping("/enviarCredenciales")
    public String credenciales(@RequestParam String username, @RequestParam String password){
        
        if(username.toLowerCase().equals("pepe") && password.toLowerCase().equals("1234")){
            return "redirect:loginSuccess";
        } else{
            return "loginError";
        }
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess(){
        return "loginSuccess";
    }
}
