import java.util.Scanner;

public class invertir_dos_digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, d1=0, d2=0, inv=0;
        System.out.println("Ingrese un numero entero de 2 digitos: ");
        num = sc.nextInt();
        d1 = num / 10;
        d2 = num % 10;
        inv = d2*10 + d1;
        System.out.println("El número invertido es: "+inv);
        
    }
}
