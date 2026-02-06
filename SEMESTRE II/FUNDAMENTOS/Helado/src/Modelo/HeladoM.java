/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class HeladoM {
    //Atributos
    private String sabor;
    private String tamano;
    private int precio;
    private String estado;
    private boolean cambiarSabor;
    
    
    
    //Constructor vacio
    public HeladoM(){

    }
    
    //Constructor total
    public HeladoM(String sab, String tam, int pre, String est){
        this.sabor = sab;
        this.tamano = tam;
        this.precio = pre;
        this.estado = est;
        
    }
    
    
    //metodos accesores (get) y modificadores (set)
    
    public String getSabor(){
        return this.sabor;
    }
    
    public void setSabor(String sab){
        this.sabor = sab;
    }
    
    public String getTamano(){
        return this.tamano;
    }
    
    public void setTamano(String tam){
        this.tamano = tam;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int pre){
        this.precio = pre;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public void setEstado(String est){
        this.estado = est;
    }
    
    
    
    public void estadoHelado(String est){
        if(est.equals("derretido")) {
            System.out.println("El estado del helado es derretido");
        } else {
            System.out.println("El estado del helado es congelado");
        }
    }
    
    public void servirHelado() {
        System.out.println(" Sirviendo el helado... ");
    }
    
    

}



