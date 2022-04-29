/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_favionataren_22141210;

import java.util.Scanner;

/**
 *
 * @author elbal
 */
public class main {

    public static void main(String[] args) {
        JugadoresApoyo proceso = new JugadoresApoyo();
        juego j = new juego();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        j.numRandom();
        int opcion;

        do {
            System.out.println("\n---M E N Ú---"
                    + "\n0. Salir"
                    + "\n1. Crear Jugador"
                    + "\n2. Listar Jugador Por Posición"
                    + "\n3. Listar Jugadores"
                    + "\n4. Jugar"
                    + "\nSeleccione una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---Registrar---");
                    proceso.registrar();
                    break;
                case 2:
                    System.out.println("---Listar Jugador Por Posición---");
                    proceso.imprimirPosicion();
                    break;
                case 3:
                    System.out.println("---Listar Jugadores---");
                    proceso.imprimirTodos();
                    break;
                case 4:
                    System.out.println("---Jugar---");
                    j.game();

                    break;

                case 0:
                    System.out.println("¡Gracias!");
                    break;
            }

        } while (opcion != 0);
    }
}
