package com.mycompany.competenciadeportivafinal.Persistencia;

import com.mycompany.competenciadeportivafinal.logica.Equipo;
import com.mycompany.competenciadeportivafinal.logica.Jugador;
import com.mycompany.competenciadeportivafinal.logica.Liga;
import java.util.List;

public class ControladoraPersistencia {

    JugadorJpaController jugadorJpa = new JugadorJpaController();
    LigaJpaController ligaJpa = new LigaJpaController();
    EquipoJpaController equipoJpa = new EquipoJpaController();

    public void agregarJugador(Jugador jugador) {
        jugadorJpa.create(jugador);
    }

    public void agregarLiga(Liga liga) {
        ligaJpa.create(liga);
    }

 
    public void agregarEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }
    
    
}
