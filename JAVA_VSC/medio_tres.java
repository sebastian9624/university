import java.util.Scanner;

public class medio_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, medio;
        System.out.println("Ingrese el primer valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        num3 = sc.nextInt();
        if (num1 != num2 && num2 != num3 && num1 != num3){
            if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
                medio = num1;
            } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
                medio = num2;
            } else {
                medio = num3;
            } 
            System.out.println("El número del medio es: " + medio);
        }else {
            System.out.println("Los tres números deben ser diferentes...");
        }
    }
}
