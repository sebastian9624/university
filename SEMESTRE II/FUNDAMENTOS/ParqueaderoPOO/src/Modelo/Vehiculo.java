/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

// Clase que representa un vehículo en el parqueadero
public class Vehiculo {


    private String placa;
    private String tipo;
    private LocalDateTime horaIngreso;
    private Usuario propietario;

    // --- Métodos para obtener y cambiar cada dato (getters y setters) ---

  
    public String getPlaca() {
        return placa;
    }

  
    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    
    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Usuario getPropietario() {
        return propietario;
    }

   
    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }
}
