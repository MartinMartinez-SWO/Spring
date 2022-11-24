package com.ejerciciodosspring.ejerciciodosspring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciodosspring.ejerciciodosspring.model.Empleado;

@Repository
public interface IEmpleado extends JpaRepository<Empleado, Long> {
List<Empleado> findByEmail(String email);
}
