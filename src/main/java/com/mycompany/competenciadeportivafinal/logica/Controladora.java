package com.mycompany.competenciadeportivafinal.logica;

import com.mycompany.competenciadeportivafinal.Persistencia.ControladoraPersistencia;
import com.mycompany.competenciadeportivafinal.Persistencia.JornadaJpaController;
import com.mycompany.competenciadeportivafinal.Persistencia.JugadorJpaController;
import com.mycompany.competenciadeportivafinal.Persistencia.LigaJpaController;
import java.util.Date;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

   public void agregarJugador(int dorsal, String nombre, int edad, String apellido, String posicion, Equipo equipo) {
    Jugador jugador = new Jugador();
    jugador.setDorsal(dorsal);
    jugador.setNombre(nombre);
    jugador.setApellido(apellido);
    jugador.setPosicion(posicion);
    jugador.setEdad(edad);
    jugador.setEquipo(equipo);

    controlPersis.agregarJugador(jugador);
}


    public void agregarLiga(String nombre, String deporte, Date fechaInicio, Date fechaFin) {
        Liga liga = new Liga(nombre, deporte, fechaInicio, fechaFin);
        controlPersis.agregarLiga(liga);
    }

    public void agregarEquipo(String nombreEquipo, Liga selectedLiga) {

        // Crea el equipo y asigna el nombre
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipo);

        // Asigna la liga al equipo
        equipo.setLiga(selectedLiga);

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
    
  public Equipo obtenerEquipoPorNombre(String nombreEquipo) {
    // Llamar al método correspondiente en ControladoraPersistencia para obtener el equipo por su nombre
    return controlPersis.obtenerEquipoPorNombre(nombreEquipo);
}

    public List<Equipo> obtenerEquipos() {
       // Llamar al método correspondiente en ControladoraPersistencia para obtener la lista de equipos
        return controlPersis.obtenerEquipos();
    }
    public List<Jugador> obtenerJugadores() {
        // Llamar al método correspondiente en JugadorJpaController para obtener la lista de jugadores
        JugadorJpaController jugadorJpa = new JugadorJpaController();
        return jugadorJpa.findJugadorEntities();
    }

   public List<Jornada> obtenerJornadasPorLiga(Liga liga) {
    JornadaJpaController jornadaJpa = new JornadaJpaController();
    if (liga != null) {
        return jornadaJpa.findJornadasByLiga(liga);
    } else {
        // Manejar el caso en el que la liga no existe
        return null;
    }
}
   public void crearNuevaJornada(Liga liga, Date fechaInicio) {
    Jornada nuevaJornada = new Jornada();
    nuevaJornada.setLiga(liga);
    nuevaJornada.setFechaInicio(fechaInicio);

    // Obtén los equipos pertenecientes a la liga
    List<Equipo> equipos = liga.getEquipos();

    // Organizar enfrentamientos aleatorios entre los equipos
    nuevaJornada.organizarEnfrentamientosAleatorios(equipos, fechaInicio, fechaInicio);
    
    List<Partido> partidos = nuevaJornada.getPartidos();
    // Antes de agregar la jornada, agregamos todos los partidos  al BD
    for (int i = 0; i <  partidos.size(); i += 1) {
        
        controlPersis.agregarPartido(partidos.get(i));
        
    }
    
    liga.getJornadas().add(nuevaJornada);
    
    

    // Guardar la nueva jornada en la base de datos a través de la controladoraPersistencia
    controlPersis.agregarJornada(nuevaJornada);

    System.out.println("Se ha creado una nueva jornada para la liga " + liga.getNombre());
}
   
   
}
