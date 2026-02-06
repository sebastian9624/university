/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EjercicioClase {
    
    /*
    Realizar un programa que permita sacar potencias mediante multiplicaciones sucesivas
    */

    //Variables globales
    static Scanner sc = new Scanner(System.in);
    static String op="";
    
    public static void main(String[] args) {
        inicio();
    }
    
    public static void inicio (){
        System.out.println("### BIENVENIDO ###");
        System.out.println("### Realizar un programa que permita sacar potencias mediante multiplicaciones sucesivas ###");
        System.out.println("1. Iniciar programa");
        System.out.println("2. Salir");
        System.out.println("");
        System.out.println("Ingrese una opción valida de 1 a 2");
        op = sc.next();
        
        switch(op){
            case "1":
                potencia();
                break;
            case "2":
                salir();
                break; 
            default:
                System.out.println("Debe ingresar una opción valida (1...2");
                break;
        }
    }
    
    
    public static void potencia (){
        int b = 0, exp = 0, res=0;
        System.out.println("Ingrese la base");
        b=sc.nextInt();
        System.out.println("Ingrese el exponente");
        exp=sc.nextInt();
        res=calcular_potencia(b, exp);
        System.out.println("La potencia es: "+ res);
        reiniciar();
    }
    
    public static int calcular_potencia(int b, int e){
        int pot = 1; 
        for (int i = 0; i < e; i++) {
            pot *= b;
        }
        return pot;
    }
    
    public static void salir (){
        
        System.out.println("Gracias por usar el programa");
        
    }
    
    public static void reiniciar(){
        System.out.println("Presione enter para volver al menú");
        sc.nextLine();
        sc.nextLine();
        inicio();
    }
}
