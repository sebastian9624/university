package Ciclos;

import java.util.Scanner;

public class ejercicio_seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su tabla de multiplicar: ");
        int numero = sc.nextInt();

        // Imprimir la tabla de multiplicar del número ingresado (del 1 al 10)
        System.out.println("\nTabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int producto = numero * i;
            System.out.println(numero + " x " + i + " = " + producto);
        }
    }
}
