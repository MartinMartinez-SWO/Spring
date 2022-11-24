package com.ejerciciorepasosiete.ejerciciorepasosiete.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @Column(name="apellido_uno")
    private String apellidoUno;

    @Column(name="apellido_dos")
    private String apellidoDoS;
    
    private Float estatura;
    private String posicion;
    private String equipo;

    public Jugador() {
    };

    public Jugador(String nombre, String apellidoUno, String apellidoDoS, Float estatura, String posicion,
            String equipo) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDoS = apellidoDoS;
        this.estatura = estatura;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDoS() {
        return apellidoDoS;
    }

    public void setApellidoDoS(String apellidoDoS) {
        this.apellidoDoS = apellidoDoS;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

}
