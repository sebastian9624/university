package Ciclos;

import java.util.Scanner;

public class ejercicio_dieciocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializar variables
        int suma = 0;
        
        // Generar enteros de 3 en 3 comenzando por 2
        for (int i = 2; i < 30; i += 3) {
            // Verificar si el número es divisible por 5
            if (i % 5 == 0) {
                suma += i; // Sumar a la suma total
            }
        }

        // Mostrar el resultado
        System.out.println("La suma de los enteros generados que son divisibles por 5 es: " + suma);
    }
}
