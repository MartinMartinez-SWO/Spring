package com.agenda.agendacontactos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.agendacontactos.model.Conctacto;
import com.agenda.agendacontactos.service.ContactoService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/contacto")
public class ContactoController {
    
    @Autowired
    private ContactoService contactoService;

    @GetMapping("/lista") //http://localhost:8080/api/contacto/lista
    public List<Conctacto> lista(){
        return contactoService.listaContactos();
    }

    @GetMapping("/{id}") //http://localhost:8080/api/contacto/{id}
    public Conctacto buscar(@PathVariable Long id){
        return contactoService.buscarContacto(id);
    }

    @PostMapping("/save")
    public Conctacto guardar(@RequestBody Conctacto conctacto){

        return contactoService.guardarContacto(conctacto);
    }

    @PutMapping("/{id}")
    public Conctacto actualizar(@PathVariable Long id, @RequestBody Conctacto contacto){

        Conctacto contactoEncontrado = contactoService.buscarContacto(id);
        contactoEncontrado.setNombre(contacto.getNombre());
        contactoEncontrado.setApellidoUno(contacto.getApellidoUno());
        contactoEncontrado.setApellidoDos(contacto.getApellidoDos());
        contactoEncontrado.setTelefono(contacto.getTelefono());

        return contactoService.guardarContacto(contactoEncontrado);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id){
        contactoService.eliminarContacto(id);
    }

    @GetMapping("/buscar-por-telefono/{telefono}") //http://localhost:8080/api/contacto/buscar-por-telefono/65854240
    public Conctacto findPorTelefono(@PathVariable Integer telefono){
        return contactoService.buscarPorTelefono(telefono);
            
    }
}
