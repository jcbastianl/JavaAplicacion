package com.mycompany.competenciadeportivafinal.Persistencia;

import com.mycompany.competenciadeportivafinal.logica.Equipo;
import com.mycompany.competenciadeportivafinal.logica.Jornada;
import com.mycompany.competenciadeportivafinal.logica.Jugador;
import com.mycompany.competenciadeportivafinal.logica.Liga;
import com.mycompany.competenciadeportivafinal.logica.Partido;
import java.util.List;

public class ControladoraPersistencia {

    JugadorJpaController jugadorJpa = new JugadorJpaController();
    LigaJpaController ligaJpa = new LigaJpaController();
    EquipoJpaController equipoJpa = new EquipoJpaController();
    JornadaJpaController jornadaJpa = new JornadaJpaController();
   PartidoJpaController partidoJpa = new PartidoJpaController();

    public void agregarJugador(Jugador jugador) {
        jugadorJpa.create(jugador);
    }

    public void agregarLiga(Liga liga) {
        ligaJpa.create(liga);
    }

    public void agregarEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }

 public Equipo obtenerEquipoPorNombre(String nombreEquipo) {
    // Llamar al método correspondiente en EquipoJpaController para obtener el equipo por su nombre
    List<Equipo> equipos = equipoJpa.findByNombre(nombreEquipo);
    if (!equipos.isEmpty()) {
        return equipos.get(0); // Devuelve el primer equipo encontrado (suponiendo que el nombre del equipo es único)
    }
    return null; // Si no se encuentra ningún equipo con ese nombre, devuelve null
}
    
    public List<Equipo> obtenerEquipos() {
        // Llamar al método correspondiente en EquipoJpaController para obtener la lista de equipos
        return equipoJpa.findEquipoEntities();
    }
    
    public Liga obtenerLigaPorNombre(String nombreLiga) {
    // Llama al método correspondiente en LigaJpaController para obtener la Liga por su nombre
    return ligaJpa.findByNombre(nombreLiga);
}
      
   public void agregarJornada(Jornada jornada) {
    // Guardar la jornada en la base de datos
    
    jornadaJpa.create(jornada);
}

 public void agregarPartido(Partido partido) {

        partidoJpa.create(partido);
    }





}
