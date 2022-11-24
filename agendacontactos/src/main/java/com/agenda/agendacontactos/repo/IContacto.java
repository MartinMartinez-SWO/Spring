package com.agenda.agendacontactos.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenda.agendacontactos.model.Conctacto;

@Repository
public interface IContacto extends JpaRepository<Conctacto, Long> {
    Conctacto findByTelefono(Integer telefono);
    
    List<Conctacto> findByNombre(String nombre);
    List<Conctacto> findByApellidoUno(String apellidoUno);
    List<Conctacto> findByApellidoDos(String apellidoDos);

}
