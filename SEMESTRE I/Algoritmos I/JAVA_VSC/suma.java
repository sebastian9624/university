import java.util.Scanner;

public class suma {
    public static void main (String [] args){
        //Declarar objeto de tipo Scanner, para capturar lo que se ingresa por teclado
        Scanner sc= new Scanner(System.in);
        int num1=0, num2=0,  res=0;
        System.out.println("Ingrese el primer  valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el primer  valor: ");
        num2 = sc.nextInt();
        res=num1 + num2;
        System.out.println("La suma de los dos valores es: "+res);
        sc.close();
    }
}