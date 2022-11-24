package com.repasoejercicioseis.repasoejercicioseis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repasoejercicioseis.repasoejercicioseis.model.Monitor;
import com.repasoejercicioseis.repasoejercicioseis.service.MonitorService;

@Controller
@RequestMapping("")
public class MonitorController {

    @Autowired
    private MonitorService monitorService;


    @GetMapping("/engadir")
    public String guardarMonitor(Monitor  monitor){
        monitorService.saveMonitor(monitor);

        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formulario(Model model){

        model.addAttribute("monitor", new Monitor());
        return "form";
    }
}
