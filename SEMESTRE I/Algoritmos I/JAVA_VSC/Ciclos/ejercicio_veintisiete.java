package Ciclos;

import java.util.Scanner;

public class ejercicio_veintisiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializar contadores y variables
        int contadorMenores15 = 0;
        int contadorMayores50 = 0;
        int contadorEntre25y45 = 0;
        int contadorPositivos = 0;
        int sumaPositivos = 0;
        
        // Leer 20 números enteros
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();

            // Contar cuántos son menores de 15
            if (numero < 15) {
                contadorMenores15++;
            }

            // Contar cuántos son mayores de 50
            if (numero > 50) {
                contadorMayores50++;
            }

            // Contar cuántos están entre 25 y 45
            if (numero >= 25 && numero <= 45) {
                contadorEntre25y45++;
            }

            // Contar cuántos son mayores que cero
            if (numero > 0) {
                contadorPositivos++;
                sumaPositivos += numero; // Acumular la suma de los números positivos
            }
        }

        // Calcular el promedio de los números positivos
        double promedioPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;

        // Mostrar los resultados
        System.out.println("Cantidad de números menores de 15: " + contadorMenores15);
        System.out.println("Cantidad de números mayores de 50: " + contadorMayores50);
        System.out.println("Cantidad de números entre 25 y 45: " + contadorEntre25y45);
        System.out.println("Cantidad de números mayores que cero: " + contadorPositivos);
        System.out.printf("Promedio de los números positivos: %.2f%n", promedioPositivos);
    }
}
