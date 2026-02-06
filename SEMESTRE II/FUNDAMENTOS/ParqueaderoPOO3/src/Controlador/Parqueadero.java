/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Vehiculo;
import java.time.LocalTime;
import java.util.LinkedList;

public class Parqueadero {
    // Lista de vehículos actualmente en el parqueadero
    private LinkedList<Vehiculo> ubicaciones;
    private int tarifaHora;
    private double caja;
    // Indica si el parqueadero está abierto o cerrado
    private boolean horario;
    private int capacidad;

    // Constructor 
    public Parqueadero() {
        this.capacidad = 10; // el parqueadero puede recibir 10 vehículos
        this.ubicaciones = new LinkedList<>();
        this.caja = 0;
        this.horario = false; // parqueadero cerrado al inicio
    }

    // Método para abrir el parqueadero con una tarifa establecida
    public void abrirParqueadero(int tarifa) {
        this.tarifaHora = tarifa; // guardamos la tarifa en la variable
        this.horario = true; // marcamos el parqueadero como abierto
        System.out.println("Parqueadero abierto.");
    }

    // Método para ingresar un vehículo
    public void ingresarVehiculo(String placa, String tipo) {
        // Verificamos si el parqueadero está abierto
        // ! = negacion, si no esta abierto
        if (!horario) {
            System.out.println("Parqueadero cerrado");
            return;
        }

        // Verificamos si hay espacio disponible
        if (ubicaciones.size() >= capacidad) {
            System.out.println("No hay capacidad disponible.");
            return;
        }

        // Creamos un nuevo vehículo y lo agregamos a la lista
        LocalTime horaIngreso = LocalTime.now();
        Vehiculo v = new Vehiculo(placa, tipo, horaIngreso);
        ubicaciones.add(v);
        System.out.println("Vehiculo ingresado: Placa " + placa + ", Tipo " + tipo + ", Hora: " + horaIngreso);
    }

    // Método para consultar un vehículo por placa
    public Vehiculo consultarVehiculo(String placaBuscada) {
        // Recorremos todos los vehículos de la lista
        for (int i = 0; i < ubicaciones.size(); i++) {
            Vehiculo v = ubicaciones.get(i);
            if (v.getPlaca().equalsIgnoreCase(placaBuscada)) {
                return v;
            }
        }
        // En caso de que no se encuentre retorna nulo
        return null;
    }

    // Método para retirar un vehículo
    public void retirarVehiculo(String placa) {
        // Buscamos el vehículo
        for (int i = 0; i < ubicaciones.size(); i++) {
            Vehiculo v = ubicaciones.get(i);
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                // Guardamos hora de salida
                LocalTime horaSalida = LocalTime.now();
                v.setHoraSalida(horaSalida);

                // Calculamos el tiempo parqueado
                v.calcularTiempo(); // actualiza el tiempo dentro del objeto

                int horas = v.getTiempoParqueo(); // obtenemos el tiempo calculado
                double total = horas * tarifaHora;

                // Sumamos el dinero a la caja
                caja += total;

                // Quitamos el vehículo de la lista
                ubicaciones.remove(i);

                System.out.println("Tiempo: " + horas + " horas. ##Total a pagar##: $" + total);
                return;
            }
        }

        // Si no se encontró el vehículo
        System.out.println("No se puede encontrar la placa");
    }

    // Método para mostrar todos los vehículos parqueados
    public void mostrarVehiculos() {
        //IsEmpty = Si esta vacio
        if (ubicaciones.isEmpty()) {
            System.out.println("Parqueadero vacio.");
        } else {
            for (int i = 0; i < ubicaciones.size(); i++) {
                Vehiculo v = ubicaciones.get(i);
                System.out.println("Placa: " + v.getPlaca() + ", Tipo: " + v.getTipo() + ", Hora ingreso: " + v.getHoraIngreso());
            }
        }
    }

    // Método para mostrar el total en caja
    public void mostrarCaja() {
        System.out.println("Dinero en caja: $" + caja);
    }

    // Método para cerrar el parqueadero
    public void cerrarParqueadero() {
        horario = false;
        System.out.println("Parqueadero cerrado.");
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public int getCantidadVehiculos() {
        return ubicaciones.size();
    }

    public int getTarifaHora() {
        return tarifaHora;
    }

}
