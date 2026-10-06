/**
 * Autor: José Antonio Pastor Rivera
 * Fecha: 09/03/2026
 * Actividad: RA5a - Del diagrama al código
 * Descripción: Clase que representa un componente del Camión.
 * Su existencia dentro de la lógica del sistema está condicionada
 * a la relación de Composición gestionada desde la clase Camion.
 */

// Atributos
public class GPS {
    private String coordenadas;

    // Constructor
    public GPS(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    // Getters y Setters
    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}