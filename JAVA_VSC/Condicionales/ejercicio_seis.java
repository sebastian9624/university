package Condicionales;
import java.util.Scanner;

public class ejercicio_seis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
            String pregunta;
            
            System.out.print("¿Esta lloviendo?: ");
            pregunta = sc.nextLine();
    
            
            if (pregunta == "si") {
                System.out.println("Necesitas paraguas.");
            } else if (pregunta == "no") {
                System.out.println("No necesitas paraguas.");
                
            } else {
                System.out.println("Ingresa una respuesta valida.");
            }
    }
}
