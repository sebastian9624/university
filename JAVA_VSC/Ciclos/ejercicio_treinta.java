package Ciclos;

import java.util.Scanner;

public class ejercicio_treinta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crear un array para almacenar los pesos anteriores
        double[] pesosAnteriores = new double[5];
        
        // Leer los pesos anteriores
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el peso anterior de la persona " + (i + 1) + " en kilos: ");
            pesosAnteriores[i] = sc.nextDouble();
        }
        
        // Iterar sobre cada miembro
        for (int i = 0; i < 5; i++) {
            double sumaPesos = 0;

            // Leer los pesos en 10 básculas
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese el peso de la persona " + (i + 1) + " en la báscula " + (j + 1) + ": ");
                double peso = sc.nextDouble();
                sumaPesos += peso; // Sumar los pesos
            }

            // Calcular el promedio de peso
            double promedioPeso = sumaPesos / 10;

            // Calcular la diferencia
            double diferencia = promedioPeso - pesosAnteriores[i];

            // Imprimir el resultado
            if (diferencia > 0) {
                System.out.printf("Persona %d: SUBIO %.2f kilos%n", (i + 1), diferencia);
            } else if (diferencia < 0) {
                System.out.printf("Persona %d: BAJO %.2f kilos%n", (i + 1), Math.abs(diferencia));
            } else {
                System.out.printf("Persona %d: MANTUVO SU PESO%n", (i + 1));
            
            }
        }
    }
}
