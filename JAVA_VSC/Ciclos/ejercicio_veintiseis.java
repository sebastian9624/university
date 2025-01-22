package Ciclos;

import java.util.Scanner;

public class ejercicio_veintiseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer el valor de N
        System.out.print("Ingrese un número entero N: ");
        int N = sc.nextInt();

        // Inicializar variable para la suma
        int sumaImpares = 0;

        // Bucle para encontrar la suma de los números impares
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) { // Verificar si el número es impar
                sumaImpares += i; // Sumar el número impar
            }
        }

        // Mostrar el resultado
        System.out.println("La suma de los números impares entre 1 y " + N + " es: " + sumaImpares);
    }
}
