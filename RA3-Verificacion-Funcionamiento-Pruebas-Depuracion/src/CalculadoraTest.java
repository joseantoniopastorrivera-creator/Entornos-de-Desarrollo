import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        System.out.println("Ejecutando testSumar...");
        assertEquals(5.0, calc.sumar(2, 3), 0.001);
    }

    @Test
    public void testRestar() {
        System.out.println("Ejecutando testRestar...");
        // OJO: Si ya corregiste el bug en Calculadora.java (return a - b),
        // este test pasará. Si no, fallará (que es lo normal al principio).
        assertEquals(5.0, calc.restar(10, 5), 0.001);
    }

    @Test
    public void testDividir() {
        assertEquals(5.0, calc.dividir(10, 2), 0.001);
        assertEquals(2.5, calc.dividir(5, 2), 0.001);
        assertEquals(0.0, calc.dividir(0, 5), 0.001);
        // CP-DIV-05: Ley de signos
        assertEquals(-5.0, calc.dividir(-10, 2), 0.001);
    }

    @Test
    public void testDividirPorCero() {
        System.out.println("Ejecutando testDividirPorCero...");
        // Verifica que lance la excepción (Bug 2)
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
    }
}