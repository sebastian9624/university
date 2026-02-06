package Ciclos;

import java.util.Scanner;

public class ejercicio_veintiocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer el número hasta el cual se buscarán primos gemelos
        System.out.print("Ingrese un número: ");
        int limite = sc.nextInt();

        // Buscar e imprimir primos gemelos
        System.out.println("Los primos gemelos entre 2 y " + limite + " son:");
        for (int i = 2; i <= limite - 2; i++) {
            if (esPrimo(i) && esPrimo(i + 2)) {
                System.out.printf("(%d, %d)%n", i, i + 2);
            }
        }
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
