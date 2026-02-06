/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factoresprimos;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class FactoresPrimos {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        //Pedir número de dos digitos
        do {
            System.out.println("Ingrese un número de dos digitos (10 a 99): ");
            numero = sc.nextInt();
       
        }while (numero < 10 || numero > 99);
        
        System.out.println(numero + " = ");
        
        descomponerEnPrimos(numero);
        
    }
    
    public static void descomponerEnPrimos (int numero){
        int divisor = 2;
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(divisor + "*");
                numero /= divisor;
            } else {
                divisor++;
            }
        }
        
        System.out.println("1*");
    }
    
    
    
}



