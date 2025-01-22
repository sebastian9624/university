package Ciclos;

import java.util.Scanner;

public class ejercicio_trece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los dos números
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        // Variable para almacenar el resultado del producto
        int producto = 0;

        // Realizar el producto mediante sumas
        for (int i = 0; i < Math.abs(numero2); i++) {
            producto += numero1; // Sumar el primer número
        }

        // Ajustar el signo del producto si el segundo número es negativo
        if (numero2 < 0) {
            producto = -producto;
        }

        // Mostrar el resultado
        System.out.println("El producto de " + numero1 + " y " + numero2 + " es: " + producto);
    }
}
