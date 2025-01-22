package Ciclos;

import java.util.Scanner;

public class ejercicio_veinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializar variables
        int mayor = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
        int menor = Integer.MAX_VALUE;  // Inicializamos con el valor máximo posible
        int numero;

        System.out.println("Ingrese una secuencia de números (ingrese un número impar para terminar):");

        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();

            // Verificar si se ingresa un número impar para terminar
            if (numero % 2 != 0) {
                break; // Salir del bucle
            }

            // Verificar si el número ingresado es mayor que el actual mayor
            if (numero > mayor) {
                mayor = numero; // Actualizar el mayor
            }

            // Verificar si el número ingresado es menor que el actual menor
            if (numero < menor) {
                menor = numero; // Actualizar el menor
            }
        }

        // Mostrar el resultado
        if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("El número mayor ingresado es: " + mayor);
            System.out.println("El número menor ingresado es: " + menor);
        } else {
            System.out.println("No se ingresaron números antes de terminar.");
        }
    }
}
