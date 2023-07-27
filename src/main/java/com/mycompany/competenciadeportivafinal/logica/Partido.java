/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.competenciadeportivafinal.logica;

/**
 *
 * @author Sebastian
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Representa un partido entre dos equipos. Contendría atributos como el equipo local, el equipo visitante, el marcador, etc.
import java.util.Date;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    
    private Equipo equipoLocal;

    
    private Equipo equipoVisitante;

    private Date fechaInicio;
    private Date fechaFin;
    
    public Partido() {
        // Puedes inicializar los atributos si es necesario
    }
    
    // Otros atributos y métodos relacionados con el partido

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Date fechaInicio, Date fechaFin) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
