/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueaderopoo;

import Controlador.Parqueadero;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.util.Scanner;

import java.util.Scanner;

public class ParqueaderoPOO {

    // Scanner para leer datos desde consola
    static Scanner sc = new Scanner(System.in);

    // Creamos un parqueadero nuevo (sin capacidad fija, porque no la manejas en el controlador)
    static Parqueadero parqueadero = new Parqueadero();

    // Capacidad máxima del parqueadero, para mostrar ubicaciones disponibles
    static int capacidad = 10;

    public static void main(String[] args) {
        menu(); // Iniciamos el menú principal
    }

    // Menú principal para que el usuario elija opciones
    public static void menu() {
        String op;
        do {
            System.out.println("#### SISTEMA PARQUEADERO ####");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Consultar vehículo");
            System.out.println("3. Consultar todos los vehículos");
            System.out.println("4. Retirar vehículo");
            System.out.println("5. Mostrar ubicaciones disponibles");
            System.out.println("6. Cierre de caja");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            op = sc.next();

            switch (op) {
                case "1":
                    ingresarVehiculoV(); // Llamamos método para ingresar vehículo
                    break;
                case "2":
                    consultarVehiculoV(); // Buscar vehículo por placa
                    break;
                case "3":
                    mostrarVehiculos(); // Mostrar todos los vehículos que están parqueados
                    break;
                case "4":
                    retirarVehiculoV(); // Retirar vehículo por placa
                    break;
                case "5":
                    mostrarUbicaciones(); // Mostrar cuántas ubicaciones quedan libres
                    break;
                case "6":
                    cierreDeCaja(); // Mostrar dinero acumulado y resetear caja
                    break;
                case "7":
                    System.out.println("Gracias por usar el sistema."); // Salir
                    break;
                default:
                    System.out.println("Opción no válida."); // Si pone una opción errada
            }
        } while (!op.equals("7")); // Mientras no elija salir, repetir el menú
    }

    // Pedir datos y crear un vehículo con propietario para ingresar al parqueadero
    public static void ingresarVehiculoV() {
        sc.nextLine(); // Limpiar buffer del Scanner

        Vehiculo v = new Vehiculo();
        Usuario u = new Usuario();

        System.out.println("Ingrese placa: ");
        v.setPlaca(sc.nextLine());

        System.out.println("Ingrese tipo de vehículo: ");
        v.setTipo(sc.nextLine());

        System.out.println("Ingrese nombre del propietario: ");
        u.setNombre(sc.nextLine());

        System.out.println("Ingrese documento del propietario: ");
        u.setDocumento(sc.nextLine());

        System.out.println("Ingrese celular del propietario: ");
        u.setCelular(sc.nextLine());

        v.setPropietario(u);

        parqueadero.ingresarVehiculo(v); // Llamamos a la función para agregar vehículo
    }

    // Buscar un vehículo por placa y mostrar detalles si lo encuentra
    public static void consultarVehiculoV() {
        System.out.println("Ingrese placa a buscar: ");
        String placa = sc.next();

        Vehiculo v = parqueadero.buscarVehiculo(placa);

        if (v != null) {
            int minutos = parqueadero.calcularMinutos(v.getHoraIngreso(), java.time.LocalDateTime.now());
            double total = (minutos / 60.0) * 2000; // Calcula cobro estimado (valorHora fijo)

            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Propietario: " + v.getPropietario().getNombre());
            System.out.println("Tiempo estacionado: " + minutos + " minutos");
            System.out.println("Total estimado: $" + total);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    // Pedir placa y retirar vehículo si está en el parqueadero
    public static void retirarVehiculoV() {
        System.out.println("Ingrese placa del vehículo a retirar: ");
        String placa = sc.next();
        parqueadero.retirarVehiculo(placa);
    }

    // Mostrar todos los vehículos parqueados con tiempo y costo estimado
    public static void mostrarVehiculos() {
        parqueadero.consultarVehiculos();
    }

    // Mostrar cuántas ubicaciones libres quedan en el parqueadero
    public static void mostrarUbicaciones() {
        parqueadero.mostrarUbicacionesDisponibles(capacidad);
    }

    // Mostrar el total acumulado en caja y resetear
    public static void cierreDeCaja() {
        parqueadero.cierreCaja();
    }
}
