/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reloj;

import Modelo.tiempo;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Reloj {

    //Variables y metodos globales
    static Scanner sc = new Scanner(System.in);
    static tiempo tiem = new tiempo();
    public static void main(String[] args) {
        /*tiempo reloj = new tiempo();
        reloj.setHora(12);
        reloj.setMinutos(43);
        reloj.setSegundos(23);
        reloj.setMarca("Casio");
        reloj.setOnOff(false);
        if (reloj.getOnOff() == true) {
            System.out.println("Son las: " + reloj.getHora() + ":" + reloj.getMinutos() + ":" + reloj.getSegundos() + " Y su marca es: " + reloj.getMarca());
        }else {
            System.out.println("El reloj esta apagado");
        }*/
        
        menu();
        
    }
    
     public static void menu(){
            String op="";
            System.out.println("#### RELOJ ####");
            System.out.println("1. Iniciar");
            System.out.println("2. Adelantar hora");
            System.out.println("3. Atrasar hora");
            System.out.println("4. Apagar");
            System.out.println("5. Encender");
            System.out.println("6. Salir");
            System.out.println("Selecciona una opción valida");
            op = sc.next();
            
            switch(op){
            case "1":
                iniciarReloj();
                break;
            case "2":
                adelantarHora();
                break;
            case "3":
                atrasarHora();
                break;
            case "4":
                apagar();
                break; 
            case "5":
                encender();
                break; 
            case "6":
                reiniciar();
                break; 
            default:
                System.out.println("Debe ingresar una opción valida (1...5");
                break;
        }
            
            
    }
     
    public static void reiniciar(){
        System.out.println("presione enter para volver al menu");
        sc.nextLine();
        sc.nextLine();
        menu();
    }
    
    
    public static void iniciarReloj(){
        System.out.println("Ingrese hora: ");
        tiem.setHora(sc.nextInt());
        System.out.println("Ingrese minutos: ");
        tiem.setMinutos(sc.nextInt());
        System.out.println("Ingrese segundos: ");
        tiem.setSegundos(sc.nextInt());
        System.out.println("Ingrese la marca: ");
        tiem.setMarca(sc.nextLine());
        sc.nextLine();
        
        System.out.println("Datos almacenados correctamente");
        System.out.println("Para visualizarlos debe encender el reloj");
        System.out.println("Desea encender el reloj? ");
        System.out.println("Si = 1 ------ No = 0 ");
        int opcion = sc.nextInt();  // Leer el número 1 o 0
        boolean encender = (opcion == 1);  // 1 es true, 0 es false
        tiem.setOnOff(encender);  // Guardar el estado
        
        
        if (encender) {
            System.out.println("Son las: " + tiem.getHora() + ":" + tiem.getMinutos() + ":" + tiem.getSegundos() + " Y su marca es: " + tiem.getMarca());
        }else {
            System.out.println("El reloj esta apagado");
        }
    }
    public static void adelantarHora(){
        
        tiem.adelantarHora();
    }
    
    public static void atrasarHora(){
        
        tiem.atrasarHora();
    }
    
    public static void apagar(){
        
        tiem.apagar();
    }
    
    public static void encender(){
        
        tiem.encender();
    }
    
}
