package Condicionales;
import java.util.Scanner;


public class calcular_edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano_actual, mes_actual, dia_actual, ano_nacimiento, mes_nacimiento, dia_nacimiento, edad, dias, meses;
        
        System.out.println("Ingrese año actual");
        ano_actual = sc.nextInt();
        System.out.println("Ingrese mes actual en un intervalo 1 - 12");
        mes_actual = sc.nextInt();
        System.out.println("Ingrese día actual en un intervalo 1 - 31");
        dia_actual = sc.nextInt();
        
        System.out.println("Ingrese año de nacimiento");
        ano_nacimiento = sc.nextInt();
        System.out.println("Ingrese mes de nacimiento en un intervalo 1 - 12");
        mes_nacimiento = sc.nextInt();
        System.out.println("Ingrese dia nacimiento");
        dia_nacimiento = sc.nextInt();
        
        if (ano_nacimiento > ano_actual) {
            System.out.println("Error: El año de nacimiento no puede ser mayor al año actual");
        } else {
            edad = ano_actual - ano_nacimiento;
            
            
            if (mes_actual < mes_nacimiento || (mes_actual == mes_nacimiento && dia_actual < dia_nacimiento)) {
                edad--;
            }
            
         
            meses = mes_actual - mes_nacimiento;
            if (meses < 0) {
                meses += 12;
            }
            
           
            dias = dia_actual - dia_nacimiento;
            if (dias < 0) {
                
                dias += 30;
                meses--;
                if (meses < 0) {
                    meses += 12;
                    edad--;
                }
            }
            
            System.out.println("Su edad es " + edad + " años con " + meses + " meses, con " + dias + " días");
        }
    }
}