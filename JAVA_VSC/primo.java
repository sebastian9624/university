import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
        if (num < 8) {
            if (num == 2 || num == 3 || num == 5 || num == 7) {
                System.out.println("El número es: " + num + " es primo");                
            } else {
                System.out.println("El número es: " + num + " no es primo");
            }
        } else {
            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                System.out.println("El número es: " + num + " no es primo");
            } else {
                System.out.println("El número es: " + num + " es primo");            
            }
        }
    }
}
