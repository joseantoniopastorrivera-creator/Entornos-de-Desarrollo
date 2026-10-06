/**
 * Autor: José Antonio Pastor Rivera
 * Fecha: 09/03/2026
 * Actividad: RA5a - Del diagrama al código
 * Descripción: Clase independiente del sistema logístico.
 * Puede existir por sí misma y relacionarse con uno o varios
 * camiones mediante una relación de Asociación simple.
 */

// Atributos
public class Conductor {
    private String nombre;
    private String licencia;

    // Constructor
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}