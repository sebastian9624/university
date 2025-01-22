package Ciclos;

import java.util.Scanner;

public class ejercicio_quince {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variable para almacenar el producto
        long producto = 1; // Usamos long para manejar grandes productos
        boolean continuar = true;

        System.out.println("Ingrese una secuencia de números (pulse 'F' para finalizar):");

        while (continuar) {
            System.out.print("Número: ");
            
            // Verificar si el siguiente token es un número
            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                producto *= numero; // Multiplicar el número al producto
            } else if (sc.hasNext()) { // Verificar si se ingresa una tecla
                String input = sc.next(); // Leer la entrada como String
                if (input.equalsIgnoreCase("F")) { // Comparar con 'F' (sin importar mayúsculas/minúsculas)
                    continuar = false; // Cambiar la condición para salir del bucle
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número o 'F' para finalizar.");
                    sc.nextLine(); // Limpiar el buffer
                }
            }
        }

        // Mostrar el resultado
        System.out.println("El producto de los números ingresados es: " + producto);
    }
}
