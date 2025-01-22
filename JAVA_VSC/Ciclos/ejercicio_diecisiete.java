package Ciclos;

import java.util.Scanner;

public class ejercicio_diecisiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer un número entero del usuario
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        // Variable para almacenar el valor binario
        StringBuilder binario = new StringBuilder();

        // Comprobar si el número es 0
        if (numero == 0) {
            binario.append("0");
        } else {
            // Convertir el número a binario mediante divisiones sucesivas
            while (numero > 0) {
                // Agregar el residuo al inicio de la cadena
                binario.insert(0, numero % 2);
                // Dividir el número entre 2
                numero = numero / 2;
            }
        }

        // Mostrar el resultado
        System.out.println("El valor en binario es: " + binario.toString());
    }
}
