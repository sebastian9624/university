package Ciclos;

import java.util.Scanner;

public class ejercicio_cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Leer 15 números negativos
         System.out.println("Ingrese 15 números negativos:");

         for (int i = 0; i < 15; i++) {
             System.out.print("Número " + (i + 1) + ": ");
             int numero = sc.nextInt();
 
             // Verificar si el número es negativo
             if (numero < 0) {
                 // Convertir a positivo multiplicando por -1
                 numero = numero * -1;
             }
 
             // Imprimir el número convertido a positivo
             System.out.println("Número positivo: " + numero);
    }
}
}
