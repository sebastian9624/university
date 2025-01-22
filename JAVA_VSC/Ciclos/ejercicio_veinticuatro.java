package Ciclos;

import java.util.Scanner;

public class ejercicio_veinticuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializar variables para almacenar el mayor múltiplo de 5 y el menor múltiplo de 3
        int mayorMultiplo5 = Integer.MIN_VALUE; // Inicializa con el valor mínimo
        int menorMultiplo3 = Integer.MAX_VALUE;  // Inicializa con el valor máximo
        boolean hayMultiplo5 = false; // Indica si se encontró un múltiplo de 5
        boolean hayMultiplo3 = false; // Indica si se encontró un múltiplo de 3
        int numero;

        System.out.println("Ingrese una secuencia de números (ingrese un número negativo para terminar):");

        // Bucle para leer los números
        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();

            // Salir si el número es negativo
            if (numero < 0) {
                break; // Termina el bucle
            }

            // Verificar si el número es múltiplo de 5
            if (numero % 5 == 0) {
                if (numero > mayorMultiplo5) {
                    mayorMultiplo5 = numero; // Actualizar el mayor múltiplo de 5
                }
                hayMultiplo5 = true; // Se encontró al menos un múltiplo de 5
            }

            // Verificar si el número es múltiplo de 3
            if (numero % 3 == 0) {
                if (numero < menorMultiplo3) {
                    menorMultiplo3 = numero; // Actualizar el menor múltiplo de 3
                }
                hayMultiplo3 = true; // Se encontró al menos un múltiplo de 3
            }
        }

        // Mostrar resultados
        if (hayMultiplo5) {
            System.out.println("El mayor múltiplo de 5 ingresado es: " + mayorMultiplo5);
        } else {
            System.out.println("No se ingresaron múltiplos de 5.");
        }

        if (hayMultiplo3) {
            System.out.println("El menor múltiplo de 3 ingresado es: " + menorMultiplo3);
        } else {
            System.out.println("No se ingresaron múltiplos de 3.");
        }
    }
}
