package com.fenix;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcesadorUsuariosTest {

    @Test
    void testProcesarListaComportamientoActual() {
        // 1. Preparación (Arrange)
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();
        List<String> lista = List.of("Ana:1", "Luis:2", "Eva:1", "Juan:99");

        // 2. Ejecución (Act)
        String resultado = procesador.procesarLista(lista);

        // 3. Verificación (Assert)
        // Comprobamos que el resultado es EXACTAMENTE el que da el código actual
        assertEquals("Admins: Ana,Eva, | Invitados: Luis,", resultado);
    }
}