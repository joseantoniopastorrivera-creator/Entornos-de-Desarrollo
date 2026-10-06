import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; 

public class GestorFacturasTest {

    @Test
    public void testCalcularTotalFactura() {
        // 1. CREAR EL MOCK
        Calculadora calcMock = mock(Calculadora.class);

        // 2. ENTRENAR AL MOCK
        // Cuando le pidan multiplicar 100 * 1.21, devuelve 121.0
        when(calcMock.multiplicar(100.0, 1.21)).thenReturn(121.0);

        // 3. EJECUTAR LA PRUEBA
        GestorFacturas gestor = new GestorFacturas();
        
        // Le pasamos la calculadora falsa
        double resultado = gestor.calcularTotalFactura(calcMock, 100.0);

        // 4. VERIFICAR
        assertEquals(121.0, resultado, 0.001);
        
        // Verificar que se llamó al método multiplicar
        verify(calcMock).multiplicar(100.0, 1.21);
    }
}