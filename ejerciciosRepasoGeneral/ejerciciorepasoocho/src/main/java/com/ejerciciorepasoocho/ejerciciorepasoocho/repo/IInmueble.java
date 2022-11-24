package com.ejerciciorepasoocho.ejerciciorepasoocho.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejerciciorepasoocho.ejerciciorepasoocho.model.Inmueble;

@Repository
public interface IInmueble extends JpaRepository<Inmueble, Long>{
    
}
