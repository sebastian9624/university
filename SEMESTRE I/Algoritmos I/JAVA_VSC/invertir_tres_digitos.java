import java.util.Scanner;

public class invertir_tres_digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, d1=0, d2=0, d3=0, inv = 0;
        System.out.println("Ingrese un número de tres dígitos: ");
        num = sc.nextInt();
        d1 = num / 100;
        d2 = (num % 100) / 10;
        d3 = (num % 10) % 10;
        inv = d3* 100 + d2 * 10 + d1;
        System.out.println("El número invertido es: " + inv);
    }
}