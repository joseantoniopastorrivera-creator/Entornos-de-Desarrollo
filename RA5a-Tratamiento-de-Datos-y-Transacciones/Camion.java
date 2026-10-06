
/**
 * Autor: José Antonio Pastor Rivera
 * Fecha: 09/03/2026
 * Actividad: RA5a - Del diagrama al código
 * Descripción: Entidad central del sistema logístico. Esta clase demuestra 
 * la implementación práctica de tres relaciones fundamentales de la POO:
 * 1. Composición: Instancia el GPS internamente (dependencia de ciclo de vida).
 * 2. Agregación: Recibe paquetes externos mediante cargarPaquete().
 * 3. Asociación: Se vincula a un Conductor independiente.
 */
import java.util.ArrayList;
import java.util.List;


//Atributos
public class Camion {
    private String matricula;
    private double capacidad;

    // Relaciones
    private GPS gps;
    private Conductor conductor;
    private List<Paquete> paquetes;

    // Constructor
    public Camion(String matricula, double capacidad) {
        this.matricula = matricula;
        this.capacidad = capacidad;

        // COMPOSICIÓN: El ciclo de vida del GPS depende del Camión.
        this.gps = new GPS("0.0000, 0.0000");
        this.paquetes = new ArrayList<>();
    }

    // AGREGACIÓN: Añade objetos creados fuera de esta clase.
    public void cargarPaquete(Paquete p) {
        this.paquetes.add(p);
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public GPS getGps() {
        return gps;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }
}