package Ciclos;

import java.util.Scanner;

public class ejercicio_catorce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los dos números
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        // Verificar si el divisor es cero
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return; // Termina el programa si el divisor es cero
        }

        // Variables para el cociente y el residuo
        int cociente = 0;

        // Realizar la división mediante restas sucesivas
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor; // Restar el divisor del residuo
            cociente++; // Incrementar el cociente
        }

        // Mostrar el resultado
        System.out.println("El cociente de " + dividendo + " y " + divisor + " es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
