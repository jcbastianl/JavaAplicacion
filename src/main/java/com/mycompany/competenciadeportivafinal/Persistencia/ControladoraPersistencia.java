package com.mycompany.competenciadeportivafinal.Persistencia;

import com.mycompany.competenciadeportivafinal.logica.Jugador;
import com.mycompany.competenciadeportivafinal.logica.Liga;



/**
 * Clase para realizar operaciones de persistencia relacionadas con Jugadores.
 */
public class ControladoraPersistencia {
JugadorJpaController jugadorJpa = new JugadorJpaController();

public void agregarJugador(Jugador jugador){
jugadorJpa.create(jugador);
}
LigaJpaController ligaJpa = new LigaJpaController();

    public void agregarLiga(Liga liga) {
        ligaJpa.create(liga);
    }

}
