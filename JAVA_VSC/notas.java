import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1=0, n2=0, n3=0, def=0;
        System.out.println("Ingrese la primer nota: ");
        n1 = sc.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        n3 = sc.nextDouble();
        def = (n1 + n2 + n3) / 3;
        System.out.println("La nota promedio es: " + def);
    }
}
