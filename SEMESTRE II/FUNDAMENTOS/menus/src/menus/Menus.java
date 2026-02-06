/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Menus {
    //crear las variables globales
    static Scanner sc = new Scanner(System.in);
    static String op="";
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        //presentar un menu de opciones al usuario
        System.out.println("### MENU PRINCIPAL ###");
        System.out.println("1. calcular potencia (multiplicación sucesiva)");
        System.out.println("2. multiplicación (sumas sucesivas)");
        System.out.println("3. división (restas sucesivas)");
        System.out.println("4. contar caracteres de una frase");
        System.out.println("5. pasar letras a números");
        System.out.println("6. salir");
        System.out.println("");
        System.out.println("Ingrese una opción valida de 1 a 6");
        op = sc.next();
        
        switch(op){
            case "1":
                potencia();
                break;
            case "2":
                multiplicacion();
                break; 
            case "3":
                division();
                break; 
            case "4":
                contar();
                break; 
            case "5":
                num_letras();
                break; 
            case "6":
                salir();
                break; 
            default:
                System.out.println("Debe ingresar una opción valida (1...6");
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
    
    
    public static void multiplicacion (){
        int n1 = 0, n2 = 0, res=0;
        System.out.println("Ingrese multiplicando: ");
        n1=sc.nextInt();
        System.out.println("Ingrese multiplicador: ");
        n2=sc.nextInt();
        res=calcular_multiplicacion(n1, n2);
        System.out.println("El resultado es: "+ res);
        reiniciar();
    }
    
    public static int calcular_multiplicacion(int n1, int n2){
        int res=0;
        for (int i = 0; i < n2; i++) {
            res += n1;
        }
        return res;
    }
    
    public static void division (){
        int n1 = 0, n2 = 0;
        System.out.println("Ingrese dividendo: ");
        n1=sc.nextInt();
        System.out.println("Ingrese divisor: ");
        n2=sc.nextInt();
        List<Integer> res = calcular_division(n1, n2);
        System.out.println("El cociente es: "+ res.get(0) + " el residuo es: " + res.get(1));
        reiniciar();
        
    }
    
    public static List<Integer> calcular_division(int n1, int n2){
        List<Integer> resultados = new ArrayList();
        int contador = 0;
        
        while (n1 >= n2) {            
            contador ++;
            n1-=n2;
        }
        resultados.add(contador);
        resultados.add(n1);
        return resultados;
    }
    
    
      
    public static void contar (){
        Scanner es = new Scanner(System.in);
        String frase ="";
        System.out.println("Ingrese una frase: ");
        frase = es.nextLine();
        System.out.println("La frase tiene: " + realizar_conteo(frase).get(0) + " vocales " + realizar_conteo(frase).get(1) + " consonantes " + realizar_conteo(frase).get(2) + " espacios ");
        reiniciar();
        
    }
    
    public static List<Integer> realizar_conteo(String f){
        List<Integer> res = new ArrayList<>();
        String let = "";
        f=f.toLowerCase();
        int voc=0, con=0, esp=0;
        for (int i=0; i<f.length(); i++) {
            let = f.substring(i, i+1);
            if (let.equals("a") || let.equals("e") || let.equals("i") || let.equals("o") || let.equals("u")) {
                voc++;
            }
            else if (let.equals(" ")) {
                esp++;
            }
            
            else {
                con++;
            }
        }
        res.add(voc);
        res.add(con);
        res.add(esp);
        return res;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void num_letras(){
        int valor=0;
        System.out.println("ingrese el numero que desea convertir ");
        valor=sc.nextInt();
        System.out.println(convertir(valor));
        reiniciar();
    }
    
    
    public static String convertir(int num){
        String let="";
        int uni=0, dec=0,cent=0,mil=0;
        if(num==0){
            return let="cero";
        }
        if(num<= 15){
            let = unidades(num);
        }else if(num > 15 && num < 100){
            uni= num%10;
            dec= num/10;
            System.out.println(decenas(dec,uni)+ unidades(uni));
        }else if(num == 100){
            return let="cien";
        }else if(num>100 && num< 1000){
            cent=num/100;
            int temp= num%100;
            if(temp > 15){
            dec=(num%100)/10;
            uni=num%10;
            let=(centenas (cent)+decenas(dec,uni)+unidades(uni));
        }else{
            let=(centenas (cent) + unidades(uni));
        }

        }else if(num>900 && num<10000){
            mil=num/1000;
            int tempo=num%1000;
        if(tempo > 15){
            cent=(num%1000)/100;
            dec=(num%100)/10;
            uni=num%10;
            let=(unidad_de_mil(mil)+centenas (cent)+decenas(dec,uni)+unidades(uni));
        }else {
            let=(unidad_de_mil(mil) + unidades(uni));
        }

        }
        return let;
    }

    /*
    FORMA CORTA
    
    else if (num>=1000 && num<10000) {
    
    int um= 0, temp2=0;
    String x="mil";
    um = num/1000;
    temp2=num%1000;
    
    if(um > 1) {
        if(temp2 > 0) 
            let = (unidades(um)+ " " + x + convertir(temp2));
        else
            let = (unidades(um) + " " +x);
    
    
        } else {
        if (temp2 > 0)
            let = x + convertir(temp2);
            else
    

    */
    
    public static String unidades(int uni){
        String let="";
    if(uni==1)
        let="uno";
    else if(uni==2)
        let="dos";
    else if(uni==3)
        let="tres";
    else if(uni==4)
        let="cuatro";
    else if(uni==5)
        let="cinco";
    else if(uni==6)
        let="seis";
    else if(uni==7)
        let="siete";
    else if(uni==8)
        let="ocho";
    else if(uni==9)
        let="nueve";
    else if(uni==10)
        let="diez";
    else if(uni==11)
        let="once";
    else if(uni==12)
        let="doce";
    else if(uni==13)
        let="trece";
    else if(uni==14)
        let="catorce";
    else if(uni==15)
        let="quince";
    return let;
    }
    
    
    public static String decenas (int dece,int uni){
    String let="";
        if(uni>0){
            switch(dece){
            case 1:
                let="dieci";
            break;
            case 2:
                let="veinti";
            break;
            case 3:
                let="treinta y ";
            break;
            case 4:
                let="cuarenta y ";
            break;
            case 5:
                let="cincuenta y ";
            break;
            case 6:
                let="sesenta y ";
            break;
            case 7:
            let="setenta y ";
            break;
            case 8:
                let="ochenta y ";
            break;
            case 9:
                let="noventa y ";
            break;
    }
    } else{
        if(dece==2)
            let="veinte";
        else if(dece==3)
            let="treinta";
        else if(dece==4)
            let="cuarenta";
        else if(dece==5)
            let="cincuenta";
        else if(dece==6)
            let="sesenta";
        else if(dece==7)
            let="setenta";
        else if(dece==8)
            let="ochenta";
        else if(dece==9)
            let="noventa";
    }
        
    return let;
    }

    
    public static String centenas(int cent) {
        String let="";
            if(cent==1)
                let="ciento ";
            else if(cent==2)
                let="doscientos ";
            else if(cent==3)
                let="trescientos ";
            else if(cent==4)
                let="cuatrocientos ";
            else if(cent==5)
                let="quinientos ";
            else if(cent==6)
                let="seiscientos ";
            else if(cent==7)
                let="setecientos ";
            else if(cent==8)
                let="ochocientos ";
            else if(cent==9)
                let="novecientos ";
                
            return let;
    }
    
    public static String unidad_de_mil(int mil){
        String let="";
        if(mil==1)
            let="mil ";
        else if(mil==2)
            let="dos mil ";
        else if(mil==3)
            let="tres mil ";
        else if(mil==4)
            let="cuatro mil ";
        else if(mil==5)
            let="cinco mil ";
        else if(mil==6)
            let="seis mil ";
        else if(mil==7)
            let="siete mil ";
        else if(mil==8)
            let="ocho mil ";
        else if(mil==9)
            let="nueve mil ";

        return let;
    }





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void salir (){
        
        System.out.println("Gracias por usar el programa");
        
    }
    
    public static void reiniciar(){
        System.out.println("Presione enter para volver al menú");
        sc.nextLine();
        sc.nextLine();
        menu();
    }
}
