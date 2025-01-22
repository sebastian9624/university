package Condicionales;
import java.util.Scanner;

public class ejercio_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor númerico: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número: "+ num + " es par");            
        } else {
            System.out.println("El número: "+ num + " es impar");           
        }
    }
}
