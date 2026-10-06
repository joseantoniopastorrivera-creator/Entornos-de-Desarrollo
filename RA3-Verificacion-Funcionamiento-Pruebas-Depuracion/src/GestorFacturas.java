/**
 * Esta clase depende de la Calculadora para funcionar.
 * Se usará para la prueba de aislamiento (Mocks).
 */
public class GestorFacturas {

    private static final double IVA = 1.21;

    /**
     * Calcula el total de una factura aplicándole el IVA.
     * Este método DEPENDE de una Calculadora.
     *
     * @param calc La instancia de Calculadora que realizará la operación.
     * @param subtotal El importe base de la factura.
     * @return El importe total (subtotal * 1.21).
     */
    public double calcularTotalFactura(Calculadora calc, double subtotal) {
        // Llama a la calculadora para hacer la multiplicación
        double total = calc.multiplicar(subtotal, IVA);
        return total;
    }
}