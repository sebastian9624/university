/* 10.	Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco 
kilómetros durante diez días, para determinar si es apto para la prueba de 5 Kilómetros 
o debe buscar otra especialidad. Para considerarlo apto debe cumplir con la siguiente 
condición: Que en ninguna de las pruebas haga un tiempo mayor a 16 minutos. 
Indique si el atleta es apto o no para la prueba de los 5 kilómetros. */
package Ciclos;

import java.util.Scanner;

public class ejercicio_diez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Variable para almacenar el tiempo
        double tiempo;
        boolean apto = true; // Inicialmente se considera apto

        // Leer los tiempos del atleta durante 10 días
        System.out.println("Ingrese los tiempos (en minutos) que tardó el atleta en recorrer 5 km durante 10 días:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Día " + i + ": ");
            tiempo = sc.nextDouble();

            // Verificar si el tiempo excede los 16 minutos
            if (tiempo > 16) {
                apto = false; // Si un tiempo es mayor a 16, no es apto
            }
        }

        
        if (apto) {
            System.out.println("El atleta es apto para la prueba de 5 kilómetros.");
        } else {
            System.out.println("El atleta NO es apto para la prueba de 5 kilómetros.");
        }
    }
}
