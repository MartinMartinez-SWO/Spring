package com.agenda.agendacontactos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.agendacontactos.model.Conctacto;
import com.agenda.agendacontactos.repo.IContacto;

@Service
public class ContactoService {
    
    @Autowired
    private IContacto contactoRepository;


    public List<Conctacto> listaContactos(){
        return contactoRepository.findAll();
    }

    public Conctacto buscarContacto(Long id){
        return contactoRepository.findById(id).orElse(null);
    }

    public Conctacto guardarContacto(Conctacto contacto){
        return contactoRepository.save(contacto);
    }

    public void eliminarContacto(Long id){
        contactoRepository.deleteById(id);
    }


    public Conctacto buscarPorTelefono(Integer telefono){
        return contactoRepository.findByTelefono(telefono);
    }
}
