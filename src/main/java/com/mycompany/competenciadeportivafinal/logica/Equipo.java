 
package com.mycompany.competenciadeportivafinal.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jugador> jugadores;
    
    @ManyToOne
    @JoinColumn(name = "liga_id")
    private Liga liga;


    // Constructor vacío requerido por JPA
    public Equipo() {
    }
    
//Constructor 
      public Equipo(String nombre, List<Jugador> jugadores, Liga liga) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.liga = liga;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
      public Liga getLiga() {
        return liga;
    }

    // Método para establecer la Liga a la que pertenece el Equipo
    public void setLiga(Liga liga) {
        this.liga = liga;
    }
    // Método para agregar un jugador al equipo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        jugador.setEquipo(this); // Establecer el equipo del jugador como este equipo
    }
    
}

