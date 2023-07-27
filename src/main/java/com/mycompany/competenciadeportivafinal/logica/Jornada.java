/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.competenciadeportivafinal.logica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Sebastian
 */
@Entity
public class Jornada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private List<Partido> partidos;

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

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    // Método para organizar los enfrentamientos entre los equipos de manera aleatoria
    private void organizarEnfrentamientosAleatorios(List<Equipo> equipos, Date fechaInicio, Date fechaFin) {
        List<Equipo> equiposAleatorios = new ArrayList<>(equipos);
        Collections.shuffle(equiposAleatorios); // Mezcla aleatoriamente los equipos

        // Crea los enfrentamientos entre los equipos mezclados
        for (int i = 0; i < equiposAleatorios.size(); i += 2) {
            if (i + 1 < equiposAleatorios.size()) {
                Equipo equipoLocal = equiposAleatorios.get(i);
                Equipo equipoVisitante = equiposAleatorios.get(i + 1);

                // Crea el partido y agrega el enfrentamiento a la lista de partidos
                Partido partido = new Partido(equipoLocal, equipoVisitante, fechaInicio, fechaFin);
                partidos.add(partido);
            }
        }
    }
}