import java.util.Scanner;

public class ordenar_ascedente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, asc;
        System.out.println("Ingrese el primer valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        num3 = sc.nextInt();
        if (num1 != num2 && num2 != num3 && num1 != num3){

        }
        else {
            System.out.println("Los tres números deben ser diferentes...");
        }
    }
}
