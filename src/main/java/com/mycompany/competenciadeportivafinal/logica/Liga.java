
package com.mycompany.competenciadeportivafinal.logica;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Sebastian
 */
@Entity
public class Liga implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String nombre;
    private String deporte;
    
    @OneToMany(mappedBy = "liga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Equipo> equipos;
    
    private Date FechaInicio;
    private Date FechaFin;

    public Liga() {
        // Constructor vacío
    }
    
    public Liga(String nombre, String deporte,  Date FechaInicio, Date FechaFin) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
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
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    public Date getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }
    public Date getFechaFin() {
        return FechaFin;
    }
    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
}