package Ciclos;

import java.util.Scanner;

public class ejercicio_doce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variable para almacenar la suma
        int suma = 0;
        int numero;

        System.out.println("Ingrese una secuencia de números (un número negativo para terminar):");

        // Leer números hasta que se introduzca un número negativo
        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();

            // Verificar si el número es negativo
            if (numero < 0) {
                break; // Salir del bucle si el número es negativo
            }

            // Sumar el número ingresado
            suma += numero;
        }

        // Mostrar la suma total
        System.out.println("\nLa suma de los números ingresados es: " + suma);
    }
}
