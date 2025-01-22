import java.util.Scanner;

public class menor_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, menor;
        System.out.println("Ingrese el primer valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el sedundo valor: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        num3 = sc.nextInt();
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            if (num1 < num2 && num1 < num3 ) {
                menor = num1;
            } else if (num2 < num1 && num2 < num3){
                menor = num2;
            } else {
                menor = num3;
            }
            System.out.println("El número menor es: " + menor);
        } else {
            System.out.println("Los tres números deben ser diferentes...");
        }
    }
}
