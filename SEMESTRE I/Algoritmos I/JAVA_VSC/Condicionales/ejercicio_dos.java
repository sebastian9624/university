package Condicionales;
import java.util.Scanner;

public class ejercicio_dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese su edad: ");
        num = sc.nextInt();
        if (num >= 18) {
            System.out.println("Es mayor de edad: " + num);
        } else if (num < 18){
            System.out.println("Es menor de edad: " + num); 
        } else {
            System.out.println("Ingres un valor correcto"); 
        }
    }
}
