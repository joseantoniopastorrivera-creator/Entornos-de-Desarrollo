/**
 * Autor: José Antonio Pastor Rivera
 * Fecha: 09/03/2026
 * Actividad: RA5a - Del diagrama al código
 * Descripción: Clase base (Superclase) que define los atributos comunes
 * de cualquier paquete. Aplica encapsulamiento estricto mediante
 * modificadores private y métodos de acceso públicos.
 */

// Atributos
public class Paquete {
    private String id;
    private double peso;
    private String destino;

    // Constructor
    public Paquete(String id, double peso, String destino) {
        this.id = id;
        this.peso = peso;
        this.destino = destino;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}