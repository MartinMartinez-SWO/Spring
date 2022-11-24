package com.repasoejercicioseis.repasoejercicioseis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repasoejercicioseis.repasoejercicioseis.model.Monitor;
import com.repasoejercicioseis.repasoejercicioseis.repo.IMonitor;

@Service
public class MonitorService {
     
    @Autowired
    private IMonitor monitorRepo;


    public void saveMonitor(Monitor monitor){
        monitorRepo.save(monitor);
    }
}
