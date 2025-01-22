package Ciclos;

import java.util.Scanner;

public class ejercicio_diecinueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer el valor de N
        System.out.print("Ingrese el número de términos de la serie de Fibonacci a generar: ");
        int N = sc.nextInt();

        // Verificar que N sea positivo
        if (N <= 0) {
            System.out.println("Por favor, ingrese un número entero y positivo.");
            return; // Termina el programa si N no es positivo
        }

        // Variables para almacenar los dos primeros términos
        int a = 1, b = 1;

        System.out.print("Los primeros " + N + " términos de la serie de Fibonacci son: ");

        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                System.out.print(a + " "); // Imprimir el primer término
            } else if (i == 2) {
                System.out.print(b + " "); // Imprimir el segundo término
            } else {
                int siguiente = a + b; // Sumar los dos anteriores
                System.out.print(siguiente + " "); // Imprimir el siguiente término
                a = b; // Actualizar a para el siguiente cálculo
                b = siguiente; // Actualizar b para el siguiente cálculo
            }
        }
    }
}
