package Ciclos;

import java.util.Scanner;

public class ejercicio_dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer 10 números
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Imprimir solo si el número es positivo
            if (numero > 0) {
                System.out.println("Número positivo: " + numero);
            }
        }
    }
}
