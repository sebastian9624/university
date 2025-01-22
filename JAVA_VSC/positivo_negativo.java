import java.util.Scanner;

public class positivo_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor númerico: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("El número: " + num + " es positivo");
        } else if (num < 0){
            System.out.println("El número: " + num + " es negativo"); 
        } else {
            System.out.println("El número: " + num + " es neutro"); 
        }
    }
}
