/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cuenta;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Banco {
    //Atributos
    private String Nit;
    private String Razon_Social;
    //para poder usar la lista, se tiene que inicializar
    //Aqui se almacena la lista de cuentas
    private LinkedList<Cuenta> Cuentas;
    
    
    
    //Metodos
    
    public Banco(){
        this.Cuentas = new LinkedList<>();
    }
    
    public void setNit(String nit) {
        this.Nit = nit;
    }
    
    public String getNit(){
        return this.Nit;
    }
    
    public void setRazonSocial(String rz) {
        this.Razon_Social = rz;
    }
    
    public LinkedList<Cuenta> getCuentas() {
        return this.Cuentas;
    }
    
    //Simulacion de metodos CRUD
    public void crearCuenta(Cuenta obj){
        //Cuentas *Plural = Lista
        //Cuenta * Singular = Objeto
        //this.Cuentas es una lista
        //add agrega a la lista
        
        
        //Validación si la cuenta existe
        for(Cuenta c: this.Cuentas){
            if(c.getNumero().equals(obj.getNumero())){
                System.out.println("La cuenta ya existe...");
                return;
            }
        }
        this.Cuentas.add(obj);
        System.out.println("La cuenta ha sido creada");
    }
    

    public Cuenta buscarCuenta(String num){
        Cuenta cta = null;
        
        //Recorrer la cuenta para buscarla
        for (Cuenta c: this.Cuentas){
            if(c.getNumero().equals(num)){
                cta = c;
            }
        }
        return cta;
    }
    
    public boolean modificarCuenta(Cuenta cta){
        boolean modificado = false;
        for (int i = 0; i < this.Cuentas.size(); i++) {
            if(this.Cuentas.get(i).getNumero().equals(cta.getNumero())){
                this.Cuentas.set(i, cta);
                modificado = true;
                break;
            }
        }
        return modificado;
    }
    
    public boolean eliminarCuenta(String num){
        String rta = "";
        Scanner s = new Scanner(System.in);
        boolean eliminado = false;
        for (int i = 0; i < this.Cuentas.size(); i++) {
            if(this.Cuentas.get(i).getNumero().equals(num)){
                System.out.println("Esta seguro de eliminar la cuenta(s/n): ");
                rta = s.next();
                //Convertir texto a minuscula
                rta = rta.toLowerCase();
                
                if (rta.equals("s")) {
                    this.Cuentas.remove(i);
                    eliminado = true;
                    //break para detener la busqueda y optimizar
                    break;
                }
                break;
            }
        }
        
        return eliminado;
    }
    
    public boolean transacciones(String num, double valor, String tra, String cla){
        Scanner x = new Scanner(System.in);
        Cuenta cta = null;
        boolean exito = false;
        
        for (int i = 0; i < this.Cuentas.size(); i++) {
            if (this.Cuentas.get(i).getNumero().equals(num)) {
                cta = this.Cuentas.get(i);
                if(tra.equals("con")){
                    cta.consignar(valor);
                    this.Cuentas.set(i, cta);
                    exito = true;
                } else if (tra.equals("sal")) {
                    if (cla.equals(cta.getClave())) {
                        System.out.println(cta.getSaldo());
                        exito=true;
                        System.out.println("Presione una tecla para continuar");
                        x.nextLine();
                        x.close();
                    } else {
                        System.out.println("Clave incorrecta");
                    }
                } else if (tra.equals("ret")){
                    if(cla.equals(cta.getClave())){
                        cta.retirar(valor, cla);
                        this.Cuentas.set(i, cta);
                        exito = true;
                    } else {
                        System.out.println("Clave incorrecta");
                        System.out.println("Presione una tecla para continuar");
                        x.nextLine();
                        x.close();  
                    }
                } else if (tra.equals("cam")){
                    String act="", nue="";
                    System.out.println("Ingrese clave actual");
                    act = x.next();
                    System.out.println("Ingrese clave nueva");
                    nue = x.next();
                    cta.cambiarClave(act, nue);
                    this.Cuentas.set(i, cta);
                    System.out.println("nueva clave " + cta.getClave());
                    exito= true;
                }
            }
            break;
        }
        return exito;
    }
    
}
