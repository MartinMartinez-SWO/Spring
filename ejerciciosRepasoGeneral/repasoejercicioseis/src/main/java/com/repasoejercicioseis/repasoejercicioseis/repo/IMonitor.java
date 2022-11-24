package com.repasoejercicioseis.repasoejercicioseis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repasoejercicioseis.repasoejercicioseis.model.Monitor;

@Repository
public interface IMonitor extends JpaRepository<Monitor, Long> {

}
