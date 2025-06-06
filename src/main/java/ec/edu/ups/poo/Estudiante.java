package ec.edu.ups.poo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String id;
    private String nombre;
    private List<Calificacion> calificaciones;

    public Estudiante() {
        this.calificaciones = new ArrayList<>();
    }

    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void agregarCalificacion(Calificacion calificacion) {
        this.calificaciones.add(calificacion);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
