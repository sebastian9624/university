package Condicionales;
import java.util.Scanner;

public class ejercicio_cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        // Pedir al usuario que ingrese una letra
        System.out.print("Ingresa una letra: ");
        letra = sc.nextLine();

        // Verificar si la letra ingresada es una vocal
        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("No es una vocal.");
        }
    }
}
