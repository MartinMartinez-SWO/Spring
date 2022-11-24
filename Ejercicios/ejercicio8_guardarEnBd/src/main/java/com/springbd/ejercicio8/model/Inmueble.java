package com.springbd.ejercicio8.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inmuebles")
public class Inmueble {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "metros_cuadrados")
    private Long metrosCuadrados;
    private Integer precio;

    public Inmueble(){}

    public Inmueble(Long id, Long metrosCuadrados, Integer precio) {
        this.id = id;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    

}
