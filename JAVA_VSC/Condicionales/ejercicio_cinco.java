package Condicionales;
import java.util.Scanner;

public class ejercicio_cinco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
            int num1, num2;
            System.out.println("Ingrese el primer valor númerico: ");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo valor númerico: ");
            num2 = sc.nextInt();
            if (num1 > num2) {
                System.out.println("El  primer número: " + num1 + " es mayor");
            } else if (num1 < num2){
                System.out.println("El segundo número: " + num2 + " es mayor"); 
            } else {
                System.out.println("Los números: " + num1 + " " + num2 + " son inguales"); 
            }
    }
}

