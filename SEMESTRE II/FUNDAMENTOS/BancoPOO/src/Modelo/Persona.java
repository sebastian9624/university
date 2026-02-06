/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

public class Persona {
    //Atributos
    
    private String documento;
    private String nombres;
    private String apellidos;
    private String genero;
    private String direccion;
    private String celular;
    private String correo;
    private LocalDate fechaNacimiento;
    private String tipo;
    
    
    
    //Metodos
    
    //Constructor vacio
    public Persona (){
        
    }
    
    //Constructor full
    public Persona(String doc, String nom, String ape, String gen, String dir, String cel, String cor, LocalDate fec, String tip){
        
        this.documento = doc;
        this.nombres = nom;
        this.apellidos = ape;
        this.genero = gen;
        this.direccion = dir;
        this.celular = cel;
        this.correo = cor;
        this.fechaNacimiento = fec;
        this.tipo = tip;
    }
    
    //Metodos accesores y modificadores get y set
    //this operador de resolucion de ambito
    public void setDocumento(String doc){
        this.documento = doc;
    }
    
    public String getDocumento(){
        return this.documento;
    }
    
   //--------------------------
    
    public void setNombre(String nom){
        this.nombres = nom;
    }
    
    public String getNombre(){
        return this.nombres;
    }
    
   //--------------------------
    
    public void setApellidos(String ape){
        this.apellidos = ape;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
   //--------------------------
    
    public void setGenero(String gen){
        this.genero = gen;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
   //--------------------------
    
    public void setDireccion(String dir){
        this.direccion = dir;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
   //--------------------------
    
    public void setCelular(String cel){
        this.celular = cel;
    }
    
    public String getCelular(){
        return this.celular;
    }
    
   //--------------------------
    
    public void setCorreo(String cor){
        this.correo = cor;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
   //--------------------------
    
    public void setFechaNacimiento(LocalDate fec){
        this.fechaNacimiento = fec;
    }
    
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
   //--------------------------
    
    public void setTipo(String tip){
        this.tipo = tip;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
   //--------------------------
}
