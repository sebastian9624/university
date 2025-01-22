package Ciclos;

import java.util.Scanner;

public class ejercicio_once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para almacenar la suma y el producto
        int suma = 0;
        long producto = 1; // Usamos long para evitar desbordamientos en el producto

        // Leer 30 números
        System.out.println("Ingrese 30 números:");

        for (int i = 1; i <= 30; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();

            // Acumular la suma
            suma += numero;

            // Acumular el producto
            producto *= numero;
        }

        // Mostrar los resultados
        System.out.println("\nLa suma de los números es: " + suma);
        System.out.println("El producto de los números es: " + producto);
    }
}
