package com.fenix;

import java.util.List;

/**
 * Clase para procesar listas de usuarios y separarlos por roles.
 * <p>
 * Esta clase permite filtrar usuarios basándose en su rol (Admin o Invitado)
 * y generar cadenas de texto ordenada.
 * </p>
 * 
 * @author José Antonio Pastor Rivera
 * @version 1.0
 */

public class ProcesadorUsuarios {

    /**
     * Constructor por defecto de la clase ProcesadorUsuarios.
     */

    private static final int ROL_INVITADO = 2;
    private static final int ROL_ADMIN = 1;

    
    /**
     * Procesa una lista de cadenas con formato "nombre:rol".
     *
     * @param usuarios Lista de strings con el formato "Nombre:ID_Rol" (ej:
     *                 "Ana:1").
     * @return String con los usuarios separados por grupos (Admins e Invitados).
     */
    public String procesarLista(List<String> usuarios) {
        String admins = "";
        String invitados = "";

        for (String u : usuarios) {
            String[] parts = u.split(":");
            if (parts.length == 2) {
                String nombre = parts[0];
                int rol = Integer.parseInt(parts[1]);

                // Número Mágico: 1 es Admin
                if (rol == ROL_ADMIN) {
                    admins = procesarAdmin(admins, nombre);
                }
                // Número Mágico: 2 es Invitado
                else if (rol == ROL_INVITADO) {
                    invitados = procesarInvitado(invitados, nombre);
                }
            }
        }
        return "Admins: " + admins + " | Invitados: " + invitados;
    }

    /**
     * Añade un usuario a la lista de invitados ordenada y estructurada con comas.
     * 
     * @param invitados La cadena actual de invitados.
     * @param nombre    El nombre a añadir.
     * @return La cadena actualizada.
     */
    private String procesarInvitado(String invitados, String nombre) {
        invitados += nombre + ",";
        return invitados;
    }

    /**
     * Añade un usuario a la lista de administradores ordenada y estructurada con
     * comas.
     * 
     * @param admins La cadena actual de administradores.
     * @param nombre El nombre a añadir.
     * @return La cadena actualizada.
     */
    private String procesarAdmin(String admins, String nombre) {
        admins += nombre + ",";
        return admins;
    }
//Cambio para probar la integración continua (CI)
}