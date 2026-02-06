/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalTime;

public class Vehiculo {
    private String placa;
    private LocalTime horaIngreso;
    private LocalTime horaSalida;
    private String tipo;
    private int tiempoParqueo; 

    
    public Vehiculo(String placa, String tipo, LocalTime horaIngreso) {
        this.placa = placa;
        this.tipo = tipo;
        this.horaIngreso = horaIngreso;
        this.tiempoParqueo = 0; // inicializamos en 0
    }

    // Constructor completo
    public Vehiculo(String placa, LocalTime horaIngreso, LocalTime horaSalida, String tipo) {
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.tipo = tipo;
        this.tiempoParqueo = 0;
    }

    // Getters y setters 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempoParqueo() {
        return tiempoParqueo;
    }

    public void setTiempoParqueo(int tiempoParqueo) {
        this.tiempoParqueo = tiempoParqueo;
    }

    // Método para calcular el tiempo parqueado en horas 
    // Retorna un String con el tiempo en horas 
    public String calcularTiempo() {
        // Convertimos horas y minutos a minutos totales
        int minutosSalida = (horaSalida.getHour() * 60) + horaSalida.getMinute();
        int minutosIngreso = (horaIngreso.getHour() * 60) + horaIngreso.getMinute();

        int tiempoMinutos = minutosSalida - minutosIngreso;

        // Calcula horas, si hay minutos extra
        int horas = tiempoMinutos / 60;
        int minutos = tiempoMinutos % 60;

        if (minutos > 0) {
            horas++; // suma 1 hora si hay minutos adicionales
        }

        this.tiempoParqueo = horas; // guarda el tiempo calculado en el atributo

        
        return "Tiempo parqueado: " + horas;
    }
}
