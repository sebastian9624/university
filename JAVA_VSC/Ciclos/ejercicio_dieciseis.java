package Ciclos;

import java.util.Scanner;

public class ejercicio_dieciseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // Variable para almacenar el número mayor
                int mayor = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
                int numero;
        
                System.out.println("Ingrese una secuencia de números (ingrese 1 para terminar):");
        
                while (true) {
                    System.out.print("Número: ");
                    numero = sc.nextInt();
        
                    // Verificar si se ingresa el número 1 para terminar
                    if (numero == 1) {
                        break; // Salir del bucle
                    }
        
                    // Verificar si el número ingresado es mayor que el actual mayor
                    if (numero > mayor) {
                        mayor = numero; // Actualizar el mayor
                    }
                }
        
                // Mostrar el resultado
                if (mayor != Integer.MIN_VALUE) {
                    System.out.println("El número mayor ingresado es: " + mayor);
                } else {
                    System.out.println("No se ingresaron números antes de terminar.");
                }
    }
}
