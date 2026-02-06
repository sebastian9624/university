package Ciclos;

import java.util.Scanner;

public class ejercicio_siete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Variables para almacenar la suma de pesos y el conteo de personas en cada categoría
         int totalNinos = 0, totalJovenes = 0, totalAdultos = 0, totalViejos = 0;
         double sumaPesoNinos = 0, sumaPesoJovenes = 0, sumaPesoAdultos = 0, sumaPesoViejos = 0;
 
         // Realizar el muestreo para 50 personas
         System.out.println("Ingrese la edad y el peso de 50 personas:");
 
         for (int i = 1; i <= 50; i++) {
             // Leer edad
             System.out.print("\nPersona " + i + " - Edad: ");
             int edad = sc.nextInt();
 
             // Leer peso
             System.out.print("Persona " + i + " - Peso (kg): ");
             double peso = sc.nextDouble();
 
             // Clasificar según la edad y sumar el peso a la categoría correspondiente
             if (edad >= 0 && edad <= 12) {
                 sumaPesoNinos += peso;
                 totalNinos++;
             } else if (edad >= 13 && edad <= 29) {
                 sumaPesoJovenes += peso;
                 totalJovenes++;
             } else if (edad >= 30 && edad <= 59) {
                 sumaPesoAdultos += peso;
                 totalAdultos++;
             } else if (edad >= 60) {
                 sumaPesoViejos += peso;
                 totalViejos++;
             }
         }
 
         // Calcular y mostrar los promedios de peso de cada categoría
         if (totalNinos > 0) {
             System.out.println("\nPromedio de peso de los niños: " + (sumaPesoNinos / totalNinos) + " kg");
         } else {
             System.out.println("\nNo se ingresaron datos para niños.");
         }
 
         if (totalJovenes > 0) {
             System.out.println("Promedio de peso de los jóvenes: " + (sumaPesoJovenes / totalJovenes) + " kg");
         } else {
             System.out.println("No se ingresaron datos para jóvenes.");
         }
 
         if (totalAdultos > 0) {
             System.out.println("Promedio de peso de los adultos: " + (sumaPesoAdultos / totalAdultos) + " kg");
         } else {
             System.out.println("No se ingresaron datos para adultos.");
         }
 
         if (totalViejos > 0) {
             System.out.println("Promedio de peso de los viejos: " + (sumaPesoViejos / totalViejos) + " kg");
         } else {
             System.out.println("No se ingresaron datos para viejos.");
         }
    }
}
