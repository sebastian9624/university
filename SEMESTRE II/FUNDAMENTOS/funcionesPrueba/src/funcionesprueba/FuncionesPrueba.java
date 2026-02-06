/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesprueba;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class FuncionesPrueba {

    static Scanner sc= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        /*double res=sumarV3(); 
        System.out.println(res);*/
        sumarV4();
    }
    
    //Recibe parametros y retorna valores
    public static int sumar (int n1, int n2) {
        int res= n1+n2;
       
        return res;
    }
    
    
    //No recibe parametros y si retorna valores
    public static void sumarV2(int n1, int n2) {
        float res=0;
        res = sumar(n1,n2);
        System.out.println(res);
      
        
    }
    
    //Recibe parametros pero no retorna valores
    public static double sumarV3 (){
        double res= 0;
        int cant =0;
        System.out.println("Ingrese cuantos numeros desea sumar: ");
        cant= sc.nextInt();
        if (cant < 2){
            System.out.println("Debe ingresar al menos dos valores: ");
            return -1; 
          } else {
            for (int i=0;i<cant;i++){
                double temp=0;
                System.out.println("Ingrese el valor " + (i+1));
                temp= sc.nextDouble();
                res += temp;
            }

        }
        return res;
    }
    
    //No recibe parametros y no retorna valores
    public static void sumarV4 (){
        double res= 0;
        int cant =0;
        System.out.println("Ingrese cuantos numeros desea sumar: ");
        cant= sc.nextInt();
        if (cant < 2){
            System.out.println("Debe ingresar al menos dos valores: ");

          } else {
            for (int i=0;i<cant;i++){
                double temp=0;
                System.out.println("Ingrese el valor " + (i+1));
                temp= sc.nextDouble();
                res += temp;
            }

        }
        System.out.println("El resultado es: "+ res);
    }
}
