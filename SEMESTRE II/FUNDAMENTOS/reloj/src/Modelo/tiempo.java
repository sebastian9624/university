/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author sebas
 */
public class tiempo {
    //definir los atributos de clase
    private int hora;
    private int minutos;
    private int segundos;
    private String marca;
    private boolean encendido_apagado;
    
    
    //definir los metodos de la clase
    
    
    
    //constructor vacio o por defecto
    public tiempo(){
        
    }
    
    //Constructor total, permite crear el objeto y llevar valores a los atributos
    public tiempo(int hor, int min, int seg, String mar, boolean on_off){
        this.hora = hor;
        this.minutos = min;
        this.segundos = seg;
        this.marca = mar;
        this.encendido_apagado = on_off;
    }
    
    //metodos accesores (get) y modificadores (set)
    public double getHora(){
        return this.hora;
    }
    
    public void setHora(int hor) {
        this.hora = hor;
    }
    
    public double getMinutos(){
        return this.minutos;
    }
    
    public void setMinutos(int min) {
        this.minutos = min;
    }
    
    public double getSegundos(){
        return this.segundos;
    }
    
    public void setSegundos(int seg) {
        this.segundos = seg;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String mar) {
        this.marca = mar;
    }
    
    public boolean getOnOff(){
        return this.encendido_apagado;
    }
    
    public void setOnOff(boolean on_off) {
        this.encendido_apagado = on_off;
    }
    
    public void adelantarHora(){
        this.hora += + 1;
    }
    
    public void atrasarHora(){
        this.hora += - 1;
    }
    
    public void apagar(){
        this.encendido_apagado = false;
    }
    
    public void encender(){
        this.encendido_apagado = true;
    }
  
  
}
