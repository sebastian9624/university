package Condicionales;
import java.util.Scanner;

public class ejercicio_nueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        
        System.out.println("Ingresa la primera letra de tu apellido: ");
        apellido = sc.nextLine();

        
        if (apellido == "A" || apellido == "B" || 
            apellido == "C" || apellido == "D" || 
            apellido == "E" || apellido == "F" || 
            apellido == "G" || apellido == "H" || 
            apellido == "I" || apellido == "J" || 
            apellido == "K" || apellido == "L" || 
            apellido == "M") {
            System.out.println("Estás en el grupo 1.");
        } else if (apellido == "N" || apellido == "O" || 
                   apellido == "P" || apellido == "Q" || 
                   apellido == "R" || apellido == "S" || 
                   apellido == "T" || apellido == "U" || 
                   apellido == "V" || apellido == "W" || 
                   apellido == "X" || apellido == "Y" || 
                   apellido == "Z") {
            System.out.println("Estás en el grupo 2.");
        } else {
            System.out.println("Error: El carácter ingresado no es una letra válida.");
        }

    }
    
}
