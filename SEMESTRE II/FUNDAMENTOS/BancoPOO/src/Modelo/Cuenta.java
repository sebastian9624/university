/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

public class Cuenta {
    //Atributos
    private String numero;
    private String tipo;
    private Persona titular;
    private LocalDate fechaApertura;
    private double saldo;
    private String clave;
    private String claveDinamica;
    
    //Metodos
    //Constructor por defecto
    public Cuenta(){
        
    }
    
    //Constructor full
    public Cuenta(String num, String tip, Persona tit, LocalDate fec, double sal, String cla, String din){
        this.numero = num;
        this.tipo = tip;
        this.titular = tit;
        this.fechaApertura = fec;
        this.saldo = sal;
        this.clave = cla;
        this.claveDinamica = din;
        
    }
    
    public void setNumero(String num){
        this.numero = num;
    }
    public String getNumero(){
        return this.numero;
    }
    
    public void setTipo(String tip){
        this.tipo = tip;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTitular(Persona tit){
        this.titular = tit;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    public void setFechaApertura(LocalDate fec){
        this.fechaApertura = fec;
    }
    public LocalDate getFechaApertura(){
        return this.fechaApertura;
    }
    
    public void setSaldo(double sal){
        this.saldo = sal;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setClave(String cla){
        this.clave = cla;
    }
    public String getClave(){
        return this.clave;
    }
    
    
    public void setClaveDinamica(String din){
        this.claveDinamica = din;
    }
    public String getClaveDinamica(){
        return this.claveDinamica;
    }
    
    //Metodo consignar
    public void consignar(double monto){
        this.saldo += monto;
    }
    
    //Metodo retirar
    public void retirar(double monto, String cla){
        
        if (this.clave.equals(cla)) {
            if (this.saldo > monto) {
                this.saldo -= monto;   
            } else {
                System.out.println("Fondos insuficientes...");
            }
            
        }else {
            System.out.println("Credenciales no validas...");
        }
        
        
    }
    
    public void cambiarClave(String ant, String nue){
        if (ant.equals(this.clave) && nue != this.clave && !nue.isEmpty()) {
            this.clave = nue;
            
        }
    }
    
}
