package Condicionales;
import java.util.Scanner;

public class ejercicio_siete {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
    
        System.out.println("Ingresa un número del 1 al 12: ");
        int numeroMes = sc.nextInt();
    
        if (numeroMes == 1) {
            System.out.println("Enero");
        } else if (numeroMes == 2) {
            System.out.println("Febrero");
        } else if (numeroMes == 3) {
            System.out.println("Marzo");
        } else if (numeroMes == 4) {
            System.out.println("Abril");
        } else if (numeroMes == 5) {
            System.out.println("Mayo");
        } else if (numeroMes == 6) {
            System.out.println("Junio");
        } else if (numeroMes == 7) {
            System.out.println("Julio");
        } else if (numeroMes == 8) {
            System.out.println("Agosto");
        } else if (numeroMes == 9) {
            System.out.println("Septiembre");
        } else if (numeroMes == 10) {
            System.out.println("Octubre");
        } else if (numeroMes == 11) {
            System.out.println("Noviembre");
        } else if (numeroMes == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Error: El número ingresado no está en el rango del 1 al 12.");
        }
    }

}

