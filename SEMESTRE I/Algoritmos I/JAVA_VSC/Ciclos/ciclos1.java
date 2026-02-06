package Ciclos;
import java.util.Scanner;

public class ciclos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /* int edad = 0, totalEdad = 0; */
        /* double promedio = 0; */
        //int num = 10;

       /*  for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un valor númerico: ");
            num = sc.nextInt();
        } */
       /* while (num < 10) {
        System.out.println("Ingrese un valor numerico: ");
        num = sc.nextInt();
        } */
       /* do {
            System.out.println("Ingrese un valor numerico: ");
            num = sc.nextInt();
            
        } while (num < 10); */

        /* for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        } */

        /* for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        } */

        /* for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la edad de la persona : " + i);
            edad = sc.nextInt();
            totalEdad += edad; //totalEdad = totalEdad + edad
            
            }
            promedio = totalEdad / 5;
            System.out.println("La sumatoria de las edades es: " + totalEdad);
            System.out.println("El promedio de las edades es: " + promedio); */
            /* while (totalEdad < 60){
                System.out.println("Ingrese su edad : ");
                edad = sc.nextInt();
                totalEdad += edad;
                
            }
            System.out.println("La sumatoria de las edades es: " + totalEdad); */
            int suma = 0;
            for (int x = 2; x <= 100; x++) {
                if (x < 8) {
                    if (x == 2 || x == 3 || x == 5 || x == 7) {
                        suma += x;               
                    } 
                } else if (x % 2 != 0 && x % 3 !=0 && x % 5 != 0 && x % 7 != 0) {
                    suma += x;
                    
                }/* else {
                        if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0) {
                            
                } else {
                    suma += x;
                }
            } */

    }
    System.out.println("La sumatoria es: " + suma);
}
}
 