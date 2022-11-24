package com.ejerciciorepasocinco.ejerciciorepasocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String home() {
        return "log";
    }

    @PostMapping("/send-data")
    public String enviar(@RequestParam String username, @RequestParam String password) {
        if (username.equals("Pepe") && password.equals("1234")) {
            return "home";
        } else
            return "authError";
    }
}
