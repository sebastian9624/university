package Ciclos;

import java.util.Scanner;

public class ejercicio_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para contar positivos, negativos y neutros
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;

        // Leer 20 números
        System.out.println("Ingrese 20 números:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Clasificar el número como positivo, negativo o neutro
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números neutros (0): " + neutros);
    }
}
