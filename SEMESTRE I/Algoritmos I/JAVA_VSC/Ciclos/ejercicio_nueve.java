package Ciclos;

import java.util.Scanner;

public class ejercicio_nueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variable para almacenar la suma de las calificaciones
        double sumaCalificaciones = 0;

        // Leer las calificaciones de 7 exámenes
        System.out.println("Ingrese las calificaciones de 7 exámenes:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = sc.nextDouble();

            // Sumar la calificación a la suma total
            sumaCalificaciones += calificacion;
        }

        // Calcular el promedio
        double promedio = sumaCalificaciones / 7;

        // Mostrar el resultado
        System.out.println("\nEl promedio de las calificaciones es: " + promedio);
    }
}
