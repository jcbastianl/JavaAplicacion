package com.mycompany.competenciadeportivafinal.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
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


  void organizarEnfrentamientosAleatorios(List<Equipo> equipos, Date fechaInicio, Date fechaFin) {
   ArrayList<Equipo> equiposAleatorios = new ArrayList<>(equipos);
    Collections.shuffle(equiposAleatorios); // Mezcla aleatoriamente los equipos

    Random random = new Random();

    List<Date> fechasDisponibles = new ArrayList<>();
    long minMillis = this.liga.getFechaInicio().getTime(); // Utilizar la fecha de inicio de la liga
    long maxMillis = this.liga.getFechaFin().getTime(); // Utilizar la fecha de fin de la liga

    // Generar la lista de fechas disponibles
    for (long millis = minMillis; millis <= maxMillis; millis += 86400000L) { // 86400000L es un día en milisegundos
        fechasDisponibles.add(new Date(millis));
    }

    while (!equiposAleatorios.isEmpty()) {
        Equipo equipoLocal = equiposAleatorios.get(0);
        equiposAleatorios.remove(0);

        // Eliminar el equipo local de la lista de equipos visitantes disponibles
        List<Equipo> equiposVisitantesDisponibles = new ArrayList<>(equiposAleatorios);

        for (int i = 0; i < equiposVisitantesDisponibles.size(); i++) {
            Equipo equipoVisita = equiposVisitantesDisponibles.get(i);

            // Seleccionar aleatoriamente una fecha disponible y eliminarla de la lista
            int randomIndex = random.nextInt(fechasDisponibles.size());
            Date fechaAleatoria = fechasDisponibles.get(randomIndex);
            fechasDisponibles.remove(randomIndex);

            // Crea el partido y agrega el enfrentamiento a la lista de partidos
            Partido partido = new Partido(equipoLocal, equipoVisita, fechaAleatoria, this);

            partidos.add(partido);
        }
    }

    System.out.println("Partidos creados: " + this.partidos);
}
}