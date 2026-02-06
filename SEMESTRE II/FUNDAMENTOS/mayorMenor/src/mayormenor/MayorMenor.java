/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class MayorMenor {

    //Variables globales
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n1 = 0, n2 = 0;
        evaluarNumeros(n1, n2);
    }
    
    public static void evaluarNumeros(int n1, int n2){
        
        
        
        System.out.println("Ingrese el primer número");
        n1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número");
        n2 = sc.nextInt();
        
        if (n1 > n2) {
            System.out.println("El primer número es mayor");
        } else {
            System.out.println("El segundo número es mayor");
        }
    }
    
}
