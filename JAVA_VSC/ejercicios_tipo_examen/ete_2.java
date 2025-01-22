package ejercicios_tipo_examen;
import java.util.Scanner;

public class ete_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = 0, acum=0;
        String num = "";
        System.out.print("Ingrese un número: ");
        num = sc.next();
        
        for (int i = 0; i < num.length(); i++) {
            base = Double.parseDouble(num.substring(i, i+1));
            acum += Math.pow(base, num.length());
        }
        if (Double.parseDouble(num) == acum) {
            System.out.println("El numero es: " + num + " es Armstrong");
        } else {
            System.out.println("El numero es: " + num + " no es Armstrong");
        }
    }
}
