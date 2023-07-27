package com.mycompany.competenciadeportivafinal.logica;

import com.mycompany.competenciadeportivafinal.Persistencia.ControladoraPersistencia;
import com.mycompany.competenciadeportivafinal.Persistencia.LigaJpaController;
import java.util.Date;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarJugador(int dorsal, String nombre, int edad, String apellido, String posicion) {

        Jugador jugador = new Jugador();
        jugador.setDorsal(dorsal);
        jugador.setNombre(nombre);
        jugador.setApellido(apellido);
        jugador.setPosicion(posicion);
        jugador.setEdad(edad);

        controlPersis.agregarJugador(jugador);
    }

    public void agregarLiga(String nombre, String deporte, Date fechaInicio, Date fechaFin) {
        Liga liga = new Liga(nombre, deporte, fechaInicio, fechaFin);
        controlPersis.agregarLiga(liga);
    }

    public void agregarEquipo(String nombreEquipo) {
    
// Crea el equipo y asigna el nombre
    Equipo equipo = new Equipo();
    equipo.setNombre(nombreEquipo);

    // Guarda el equipo en la base de datos a través de la controladoraPersistencia
    controlPersis.agregarEquipo(equipo);
}
    
    public Liga obtenerLigaPorNombre(String nombreLiga) {
        LigaJpaController ligaJpa = new LigaJpaController();
        return ligaJpa.findLigaByNombre(nombreLiga);
    }

    public List<Liga> obtenerLigas() {
        LigaJpaController ligaJpa = new LigaJpaController();
        return ligaJpa.findLigaEntities();
    }
}
