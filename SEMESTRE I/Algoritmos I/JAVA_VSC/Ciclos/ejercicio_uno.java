package Ciclos;

import java.util.Scanner;

public class ejercicio_uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para acumular la suma del cubo y la cuarta potencia
        int sumaCubo = 0;
        int sumaCuartaPotencia = 0;

        // Leer 10 números
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Calcular el cubo y la cuarta potencia
            int cubo = numero * numero * numero;
            int cuartaPotencia = numero * numero * numero * numero;

            // Acumular los resultados
            sumaCubo += cubo;
            sumaCuartaPotencia += cuartaPotencia;
        }
        // Mostrar las sumas acumuladas
        System.out.println("Suma total de los cubos: " + sumaCubo);
        System.out.println("Suma total de las cuartas potencias: " + sumaCuartaPotencia); 
    }
}
