package Ciclos;

import java.util.Scanner;

public class ejercicio_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para almacenar la suma de calificaciones y la calificación más baja
        double sumaCalificaciones = 0;
        double calificacionMasBaja = Double.MAX_VALUE;  // Se inicializa con un valor muy alto

        // Leer las calificaciones de 10 alumnos
        System.out.println("Ingrese las calificaciones de 10 alumnos:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Calificación del alumno " + i + ": ");
            double calificacion = sc.nextDouble();

            // Sumar la calificación a la suma total
            sumaCalificaciones += calificacion;

            // Verificar si es la calificación más baja
            if (calificacion < calificacionMasBaja) {
                calificacionMasBaja = calificacion;
            }
        }

        // Calcular la calificación media
        double calificacionMedia = sumaCalificaciones / 10;

        // Mostrar los resultados
        System.out.println("\nLa calificación media del grupo es: " + calificacionMedia);
        System.out.println("La calificación más baja del grupo es: " + calificacionMasBaja);
    }
}
