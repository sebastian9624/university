/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class CursoM {
    
    //Atributos
    private String nombre;
    private String codigo;
    private int duracion;
    private String docente;
    private int cuposDisponibles;
    private boolean cursoCancelado;
    
    
    
    //Constructor vacio
    public CursoM(){

    }
    
    //Constructor total
    public CursoM(String nom, String cod, int dur, String doc, int cupo){
        this.nombre = nom;
        this.codigo = cod;
        this.duracion = dur;
        this.docente = doc;
        this.cuposDisponibles = cupo;
        this.cursoCancelado = false;
        
    }
    
    
    //metodos accesores (get) y modificadores (set)
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(String cod){
        this.codigo = cod;
    }
    
    public int getDuracion(){
        return this.duracion;
    }
    
    public void setDuracion(int dur){
        this.duracion = dur;
    }
    
    
    
    
}
