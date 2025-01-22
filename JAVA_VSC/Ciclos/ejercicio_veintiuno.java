package Ciclos;

import java.util.Scanner;

public class ejercicio_veintiuno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializar variable para la suma
        int suma = 0;

        System.out.println("Ingrese números para sumar (la suma se detendrá cuando sea mayor o igual a 124):");

        // Bucle para sumar números
        while (suma < 124) {
            System.out.print("Número: ");
            int numero = sc.nextInt();
            suma += numero; // Sumar el número ingresado a la suma total
        }

        // Mostrar el resultado final
        System.out.println("La suma final es: " + suma);
    }
}
