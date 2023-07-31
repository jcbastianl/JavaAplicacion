package com.mycompany.competenciadeportivafinal.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Jornada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "jornada", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Partido> partidos;

    @ManyToOne
    @JoinColumn(name = "liga_id")
    private Liga liga;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio;



    public Jornada() {
        partidos = new ArrayList<>();
    }

    public Jornada(List<Equipo> equipos, Date fechaInicio, Date fechaFin) {
        partidos = new ArrayList<>();
        organizarEnfrentamientosAleatorios(equipos, fechaInicio, fechaFin);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }


    // Método para organizar los enfrentamientos entre los equipos de manera aleatoria
    void organizarEnfrentamientosAleatorios(List<Equipo> equipos, Date fechaInicio, Date fechaFin) {
        ArrayList<Equipo> equiposAleatorios = new ArrayList<>(equipos);
        Collections.shuffle(equiposAleatorios); // Mezcla aleatoriamente los equipos

        // Crea los enfrentamientos entre los equipos mezclados
        for (int i = 0; i < equiposAleatorios.size(); i += 2) {
            if (i + 1 < equiposAleatorios.size()) {
                Equipo equipoLocal = equiposAleatorios.get(i);
                Equipo equipoVisita = equiposAleatorios.get(i + 1);

                // Crea el partido y agrega el enfrentamiento a la lista de partidos
                Partido partido = new Partido(equipoLocal, equipoVisita, fechaInicio, fechaFin, this);
                
                
                
                partidos.add(partido);
            }
        }
        System.out.println("Partiods creados: " + this.partidos);
    }
}