package com.mycompany.competenciadeportivafinal.logica;

import com.mycompany.competenciadeportivafinal.Persistencia.ControladoraPersistencia;
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
    public void agregarLiga(String nombre, String deporte,  Date fechaInicio, Date fechaFin) {
        Liga liga = new Liga(nombre, deporte,  fechaInicio, fechaFin);
        controlPersis.agregarLiga(liga);
    }
   
}
   
