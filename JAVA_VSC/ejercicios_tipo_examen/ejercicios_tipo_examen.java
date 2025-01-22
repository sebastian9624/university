package ejercicios_tipo_examen;
import java.util.Scanner;

public class ejercicios_tipo_examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ultimos=0, cont=0;
        String num="", ult = "";
        long fact=1;
        boolean primo = false;
        System.out.println("Ingrese un valor numerico de 3 o 4 digitos: ");
        num=sc.next();
        if (num.length() == 3 || num.length() == 4) { //Length = longitud
            for (int i = num.length() - 2; i < num.length(); i++) {
                /* System.out.println(num.substring(i, i+1)); */ //mostrar y dividir los valores de un string
                ult += num.substring(i, i+1);

            } 
            ultimos = Integer.parseInt(ult); //Conversion de String a Entero
            if (ultimos < 8) {
                if (ultimos == 2 || ultimos == 3 || ultimos == 5 || ultimos == 7) {
                    primo = true;
                    
                }
            } else if (ultimos % 2 != 0 && ultimos % 3 != 0 && ultimos % 5 != 0 && ultimos % 7 != 0 ) {
                primo = true;
            }
            if (primo == true) {
                for (int i = 1; i <= ultimos; i++) {
                    fact *= i;
                }
                System.out.println("El factorial de: " + ultimos + " es: " + fact);
            } else {
                while (primo != true ) {
                    ultimos ++;
                    if (ultimos < 8) {
                        if (ultimos == 2 || ultimos == 3 || ultimos == 5 || ultimos == 7) {
                            primo = true;
                            
                        }
                    } else if (ultimos % 2 != 0 && ultimos % 3 != 0 && ultimos % 5 != 0 && ultimos % 7 != 0 ) {
                        primo = true;
                    }
                    
                    cont ++;
                }
                System.out.println("Le faltan: "+ cont + " unidades para ser primo...");
            }
        } else {
            System.out.println("No sirve");
        }
    }
}
