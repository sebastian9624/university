package Condicionales;
import java.util.Scanner;

public class ejercicio_diez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        temperatura = sc.nextDouble();

        
        if (temperatura < 0) {
            System.out.println("Está muy frío.");
        } else if (temperatura >= 0 && temperatura <= 20) {
            System.out.println("Está frío.");
        } else if (temperatura >= 21 && temperatura <= 30) {
            System.out.println("Está cálido.");
        } else {
            System.out.println("Está caliente.");
        }
    }
}
