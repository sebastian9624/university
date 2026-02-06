/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancopoo;

import Controlador.Banco;
import Modelo.Cuenta;
import Modelo.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class BancoPOO {
    
    //Variables y metodos globales
    static Scanner sc = new Scanner(System.in);
    static Banco banco = null;
    static Cuenta cuenta = null;
    static Persona per = null;
    public static void main(String[] args) {
        
        menu();
        
    }
    
    public static void menu(){
            String op="";
            System.out.println("#### BANCO PRUEBA ####");
            System.out.println("1. Abrir Banco");
            System.out.println("2. Crear Cuenta");
            System.out.println("3. Consultar Cuenta");
            System.out.println("4. Modificar Cuenta");
            System.out.println("5. Eliminar Cuenta");
            System.out.println("6. Realizar Transacciones");
            System.out.println("7. Salir");
            System.out.println("Selecciona una opción valida");
            op = sc.next();
            
            switch(op){
            case "1":
                abrirBanco();
                break;
            case "2":
                crearCuentaV();
                break;
            case "3":
                buscarCuentaV();
                break; 
            case "4":
                modificarCuentaV();
                break; 
            case "5":
                eliminarCuentaV();
                break; 
            case "6":
                transacciones();
                break;
            case "7":
                salir();
                break; 
            
            default:
                System.out.println("Debe ingresar una opción valida (1...7");
                reiniciar();
                break;
        }
            
            
    }
    public static void salir(){
        System.out.println("Gracias por utilizar el programa");
    }
    
    
    public static void reiniciar(){
        System.out.println("presione enter para volver al menu");
        sc.nextLine();
        sc.nextLine();
        menu();
    }
    
    public static void transacciones(){
        int opc = 0;
        Scanner tra = new Scanner (System.in);
        
        System.out.println("Indique la transacción a realizar");
        System.out.println("1. Consginar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Cambiar clave");
        System.out.println("5. Volver al menu principal");
        System.out.println("Ingrese una opcion valida (1...5)");
        opc = tra.nextInt();
        
        
        switch(opc){
            case 1:
                consignar();
                break;
            case 2:
                retirar();
                break;
            case 3:
                consultarSaldo();
                break; 
            case 4:
                cambiarClave();
                break; 
            case 5:
                reiniciar();
                break; 
               
            default:
                System.out.println("Debe ingresar una opción valida (1...5");
                reiniciar();
                break;
            
        }
    }
    
    public static void consignar(){
        Scanner con = new Scanner(System.in);
        String num ="";
        double valor = 0;
        System.out.println("### FORMULARIO DE CONSIGNACIONES ###");
        System.out.println("Ingrese el número de cuenta: ");
        num = con.next();
        System.out.println("Ingrese valor a consignar: ");
        valor = con.nextDouble();
        banco.transacciones(num, valor, "con", " ");
        reiniciar();
    }
    
    
    public static void retirar(){
        Scanner con = new Scanner(System.in);
        String num ="", cla="";
        double valor = 0;
        System.out.println("### FORMULARIO DE RETIRO ###");
        System.out.println("Ingrese el número de cuenta: ");
        num = con.next();
        System.out.println("Ingrese clave");
        cla = con.next();
        System.out.println("Ingrese valor a retirar: ");
        valor = con.nextDouble();
        
        
        banco.transacciones(num, valor, "ret", cla);
        reiniciar();    
        
    }
    
    public static void consultarSaldo(){
        Scanner con = new Scanner(System.in);
        String num ="", cla="";
        double valor = 0;
        System.out.println("### FORMULARIO DE CONSULTAR SALDO ###");
        System.out.println("Ingrese el número de cuenta: ");
        num = con.next();
        System.out.println("Ingrese clave");
        cla = con.next();
        
        banco.transacciones(num, 0, "sal", cla);
        reiniciar();    
    }
    
    public static void cambiarClave(){
        Scanner con = new Scanner(System.in);
        String num ="";
        double valor = 0;
        System.out.println("### FORMULARIO DE CAMBIAR CLAVE ###");
        System.out.println("Ingrese el número de cuenta: ");
        num = con.next();
        
        banco.transacciones(num, 0, "cam", "");
        reiniciar();
    }
    
    public static void abrirBanco(){
        
        if (banco == null){
            banco = new Banco();
            System.out.println("Ingrese el NIT del Banco: ");
            banco.setNit(sc.next());
            System.out.println("Ingrese razón social del Banco: ");
            banco.setRazonSocial(sc.next());
            reiniciar();
        } else {
            System.out.println("El banco ya esta abierto");
            reiniciar();
        }
    }
    
    public static void crearCuentaV(){
        per = new Persona();
        cuenta = new Cuenta();
        
        sc.nextLine();
        
        System.out.println("Ingrese documento: ");
        per.setDocumento(sc.nextLine());
        
        System.out.println("Ingrese nombre: ");
        per.setNombre(sc.nextLine());
     
        System.out.println("Ingrese apellidos: ");
        per.setApellidos(sc.nextLine());
        
        System.out.println("Ingrese genero: ");
        per.setGenero(sc.nextLine());
        
        System.out.println("Ingrese direccion: ");
        per.setDireccion(sc.nextLine());
       
        System.out.println("Ingrese celular: ");
        per.setCelular(sc.nextLine());
        
        System.out.println("Ingrese correo: ");
        per.setCorreo(sc.nextLine());
        
        System.out.println("Ingrese tipo de cliente: ");
        per.setTipo(sc.nextLine());
        
        
        
        //LocalDate.now() = captura fecha actual
        per.setFechaNacimiento(LocalDate.now());
        
        Scanner sc1 = new Scanner(System.in);
        cuenta = new Cuenta();
        System.out.println("Ingrese número de cuenta: ");
        cuenta.setNumero(sc.nextLine());
        
        System.out.println("Ingrese tipo de cuenta: ");
        cuenta.setTipo(sc.nextLine());
       
        System.out.println("Ingrese saldo inicial: ");
        cuenta.setSaldo(sc1.nextDouble());
        System.out.println("Ingrese clave: ");
        cuenta.setClave(sc.nextLine());
        
        cuenta.setClaveDinamica("5555");
        cuenta.setFechaApertura(LocalDate.now());
        cuenta.setTitular(per);
        
        banco.crearCuenta(cuenta);
          
        reiniciar();
        
    }
    
    public static void buscarCuentaV(){
        String num = "";
        System.out.println("Ingrese numero de cuenta buscar: ");
        num = sc.next();
        Cuenta temp = banco.buscarCuenta(num);
        if (temp == null){
            System.out.println("Cuenta no encontrada");
            
        }else {
            System.out.println("Número de cuenta: " + temp.getNumero() 
                    + " Saldo: " + temp.getSaldo() 
                    + " Tipo: " + temp.getTipo() 
                    + " Clave: " + temp.getClave() 
                    + " Clave dinamica: " + temp.getClaveDinamica() 
                    + " Titular: " + temp.getTitular().getNombre()
                    + " Celular: " + temp.getTitular().getCelular());
            
        }

        reiniciar();
    }
    
    

    private static void modificarCuentaV() {
        String n = "";
        Scanner sl = new Scanner(System.in);
        System.out.println("Ingrese el número de la cuenta a modificar");
        n= sc.next();
        
        Cuenta cta = banco.buscarCuenta(n);
        if (cta != null){
            System.out.println("Ingrese nuevo saldo: ");
            cta.setSaldo(sl.nextDouble());
            System.out.println("Ingrese nueva clave: ");
            cta.setClave(sc.next());
            System.out.println("Ingrese clave dinamica: ");
            cta.setClaveDinamica(sc.next());
            System.out.println("Ingrese nuevo celular: ");
            
            Persona p = cta.getTitular();
            p.setCelular(sc.next());
            cta.setTitular(p);
            
            boolean modi = banco.modificarCuenta(cta);
            if(modi){
                System.out.println("La cuenta se ha modificado");
            } else {
                System.out.println("Error al aplicar la modificación");
            }
        }else {
            System.out.println("La cuenta existe...");
        }
        reiniciar();
    }

    private static void eliminarCuentaV() {
        String num = "";
        System.out.println("Ingrese numero de la cuenta a eliminar: ");
        num = sc.next();
        boolean r = banco.eliminarCuenta(num);
        if (r) {
            System.out.println("La cuenta ha sido eliminada");
        } else {
            System.out.println("No fue posible a eliminar la cuenta...");
        }
        reiniciar();
    }
}