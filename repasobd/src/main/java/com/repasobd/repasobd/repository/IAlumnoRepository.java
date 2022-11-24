package com.repasobd.repasobd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repasobd.repasobd.model.Alumno;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Long>{
    
}
