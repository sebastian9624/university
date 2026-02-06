/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Usuario {

    // Atributos o datos que tendrá cada usuario
    private String documento;  
    private String nombre;     
    private String celular;    

    // Métodos públicos para acceder y modificar cada dato (get y set)


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCelular() {
        return celular;
    }

 
    public void setCelular(String celular) {
        this.celular = celular;
    }
}
