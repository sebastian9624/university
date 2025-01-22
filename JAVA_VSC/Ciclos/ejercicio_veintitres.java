package Ciclos;

import java.util.Scanner;

public class ejercicio_veintitres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los valores de n e i
        System.out.print("Ingrese el valor de n (n >= 0): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el valor de i (0 <= i <= n): ");
        int i = sc.nextInt();

        // Validar la entrada
        if (n < 0 || i < 0 || i > n) {
            System.out.println("Valores inválidos. Asegúrese de que n >= 0 y 0 <= i <= n.");
            return; // Termina el programa si los valores son inválidos
        }

        // Calcular el resultado de la fórmula
        long resultado = factorial(n) / (factorial(i) * factorial(n - i));

        // Mostrar el resultado
        System.out.println("El resultado de C(" + n + ", " + i + ") es: " + resultado);
    }

    // Método para calcular el factorial
    private static long factorial(int numero) {
        long resultado = 1; // Inicializar el resultado
        for (int j = 1; j <= numero; j++) {
            resultado *= j; // Multiplicar para calcular el factorial
        }
        return resultado; // Devolver el factorial calculado
    }
}
