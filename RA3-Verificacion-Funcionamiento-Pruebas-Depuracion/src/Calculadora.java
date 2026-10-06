/**
 * Esta clase contiene métodos aritméticos simples.
 * CONTIENE ERRORES INTENCIONADOS para la práctica de RA3.
 */
public class Calculadora {

    /**
     * Suma dos números. (Este funciona bien).
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Multiplica dos números. (Este funciona bien).
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Resta dos números.
     * BUG 1: Contiene un error lógico.
     */
    public double restar(double a, double b) {
        // ERROR: La lógica está invertida.
        return a - b; 
    }

    /**
     * Divide dos números.
     * BUG 2: No gestiona la división por cero.
     */
    public double dividir(double a, double b) {
    // CORREGIDO: Verificamos si b es 0 para lanzar la excepción
    if (b == 0) {
        throw new ArithmeticException("División por cero");
    }
    return a / b;
}
}