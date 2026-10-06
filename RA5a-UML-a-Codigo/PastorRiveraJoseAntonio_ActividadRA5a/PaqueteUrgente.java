/**
 * Autor: José Antonio Pastor Rivera
 * Fecha: 09/03/2026
 * Actividad: RA5a - Del diagrama al código
 * Descripción: Subclase que hereda de Paquete.
 * Añade atributos específicos de prioridad manteniendo la estructura
 * base de la superclase mediante herencia.
 */
public class PaqueteUrgente extends Paquete {
    private int prioridad;

    // Constructor usando super
    public PaqueteUrgente(String id, double peso, String destino, int prioridad) {
        super(id, peso, destino);
        this.prioridad = prioridad;
    }

    // Getters y Setters
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}