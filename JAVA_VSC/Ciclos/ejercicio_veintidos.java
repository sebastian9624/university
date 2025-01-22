package Ciclos;

import java.util.Scanner;

public class ejercicio_veintidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPrimos = 0; // Inicializar variable para la suma de números primos

        System.out.println("Ingrese 30 números:");

        // Bucle para leer 30 números
        for (int i = 1; i <= 30; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();

            // Verificar si el número es primo
            if (esPrimo(numero)) {
                sumaPrimos += numero; // Sumar el número primo a la suma total
            }
        }

        // Mostrar la suma de los números primos
        System.out.println("La suma de los números primos ingresados es: " + sumaPrimos);
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por otro número, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
}
