/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helado;

import Modelo.HeladoM;
import java.util.Scanner;


public class Helado {
//Variables y metodos globales
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        //crear una instancia de Helado
        HeladoM helado = new HeladoM();
        
        
        System.out.println("### Bienvenido a la heladeria###");
        System.out.println("Ingrese un sabor de helado: ");
        helado.setSabor(sc.nextLine());
        
        System.out.println("Ingrese tamaño de helado: ");
        helado.setTamano(sc.nextLine());
        
        System.out.println("Ingrese un precio de helado: ");
        helado.setPrecio(sc1.nextInt());
        
        System.out.println("Ingrese un estado: 'derretido o congelado' ");
        helado.setEstado(sc.nextLine());
        
        System.out.println("### A continuación su pedido ###");
        
        helado.servirHelado();
        System.out.println("Su sabor es: " + helado.getSabor() + 
                " su tamaño es: " + helado.getTamano() + 
                " su precio es: " + helado.getPrecio() +
                " su estado es: " + helado.getEstado());
        
        System.out.println("Desea cambiar sabor?");
        String cambiarSabor = sc.nextLine();
        if (cambiarSabor.equals("si")) {
            System.out.println("Ingrese un sabor de helado: ");
            helado.setSabor(sc.nextLine());
            helado.servirHelado();
            System.out.println("Su NUEVO sabor es: " + helado.getSabor() + 
                " su tamaño es: " + helado.getTamano() + 
                " su precio es: " + helado.getPrecio() +
                " su estado es: " + helado.getEstado());
        }else {
            System.out.println("Gracias por consumir...");
        }
        
    }
    
}
