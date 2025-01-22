package Condicionales;
import java.util.Scanner;

public class ejercicio_ocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion;
        System.out.print("Ingresa la calificación del examen (entre 0 y 100): ");
        calificacion = sc.nextInt();

        
        if (calificacion >= 0 && calificacion <= 100) {
            
            if (calificacion >= 60) {
                System.out.println("El alumno aprobó.");
            } else {
                System.out.println("El alumno reprobó.");
            }
        } else {
            
            System.out.println("Error: La calificación ingresada no está en el rango de 0 a 100.");
        }
        
    }
}
