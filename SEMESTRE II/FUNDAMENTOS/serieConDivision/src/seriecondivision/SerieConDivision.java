/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriecondivision;

/**
 *
 * @author angie
 */
public class SerieConDivision {

    /*
    
    */

    public static void main(String[] args) {
        double y; 
        
        for (int i = 20; i >=-5; i--){
            if (i != 0){
                y = 1 + (1.0 / i);
                System.out.println("i = " + i + " = y = " + y);
            } else {
                System.out.println("No se puede dividir por cero");
            }
        }
    }
    
}
