/**
 * Autor: José Antonio Pastor Rivera
 * Fecha: 09/03/2026
 * Actividad: RA5a - Del diagrama al código
 * Descripción: Subclase que hereda de Paquete.
 * Demuestra la relación de Herencia extendiendo la superclase e invocando
 * al constructor padre mediante la instrucción super().
 */
public class PaqueteFragil extends Paquete {
    private double seguro;

    // Constructor usando super
    public PaqueteFragil(String id, double peso, String destino, double seguro) {
        super(id, peso, destino);
        this.seguro = seguro;
    }

    // Getters y Setters
    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
}