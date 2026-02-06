/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.time.LocalDateTime;
import java.util.LinkedList;

import java.time.LocalDateTime;
import java.util.LinkedList;


public class Parqueadero {

    private LinkedList<Vehiculo> vehiculos;
    private double caja;
    private double valorHora = 2000;

    // Constructor: cuando creamos un parqueadero, inicializamos la lista y la caja
    public Parqueadero() {
        this.vehiculos = new LinkedList<>();
        this.caja = 0;
    }

    public void ingresarVehiculo(Vehiculo v) {
        // vehiculo no este ya en la lista
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo ve = vehiculos.get(i);
            if (ve.getPlaca().equals(v.getPlaca())) {
                System.out.println("El vehículo ya está ingresado.");
                return; 
            }
        }

      
        v.setHoraIngreso(LocalDateTime.now());

        // Lo agregamos a la lista de vehículos
        vehiculos.add(v);

        System.out.println("Vehículo ingresado correctamente.");
    }

    
    public Vehiculo buscarVehiculo(String placa) {
        // Recorremos la lista
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            if (v.getPlaca().equals(placa)) {
             
                return v;
            }
        }
  
        System.out.println("Vehiculo no encontrado.");
        return null;
    }

    public void consultarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el parqueadero.");
            return;
        }

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            int minutos = calcularMinutos(v.getHoraIngreso(), LocalDateTime.now());
            double total = (minutos / 60.0) * valorHora;

            // Mostramos la información al usuario
            System.out.println("Placa: " + v.getPlaca() + " Tiempo: " + minutos + " minutos --- Cobro total: $" +  total);
        }
    }

   
    public static int calcularMinutos(LocalDateTime inicio, LocalDateTime fin) {
        int minutosInicio = inicio.getHour() * 60 + inicio.getMinute();
        int minutosFin = fin.getHour() * 60 + fin.getMinute();

        int minutos = minutosFin - minutosInicio;

        return minutos;
    }


    public boolean retirarVehiculo(String placa) {
        // Recorremos la lista buscando la placa
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);

            if (v.getPlaca().equals(placa)) {
                
                int minutos = calcularMinutos(v.getHoraIngreso(), LocalDateTime.now());
                double total = (minutos / 60.0) * valorHora;

                caja += total;

                // Sacamos el vehículo de la lista
                vehiculos.remove(i);

                
                System.out.println("Total actual en caja: $" + caja);
                System.out.println("Vehículo retirado. Total a pagar: $" + total);

                return true; 
            }
        }

        
        System.out.println("Vehiculo no esta en el parqueadero.");
        return false;
    }

  
    public void mostrarUbicacionesDisponibles(int capacidad) {
        int disponibles = capacidad - vehiculos.size();
        System.out.println("Ubicaciones disponibles: " + disponibles + "---" + capacidad);
    }

   
    public void cierreCaja() {
        System.out.println("Cierre de caja diario. Total recaudado: $" + caja);
        caja = 0;
    }
}
