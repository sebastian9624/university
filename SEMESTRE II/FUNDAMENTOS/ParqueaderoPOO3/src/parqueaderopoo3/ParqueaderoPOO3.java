/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueaderopoo3;

import Controlador.Parqueadero;
import Modelo.Vehiculo;
import java.time.LocalTime;
import java.util.Scanner;

import java.time.LocalTime;
import java.util.Scanner;

public class ParqueaderoPOO3 {

    // Scanner para leer datos desde teclado
    static Scanner sc = new Scanner(System.in);

    // Creamos un parqueadero que manejará la lista de vehículos y cobros
    static Parqueadero parqueadero = new Parqueadero();

    public static void main(String[] args) {
        // Iniciamos mostrando el menú
        menu();
    }

    // Menú principal del programa, muestra opciones y recibe elección del usuario
    public static void menu() {
        System.out.println("------MENU PARQUEADERO------");
        System.out.println("1. Abrir Parqueadero");
        System.out.println("2. Ingresar Vehiculo");
        System.out.println("3. Consultar Vehiculo");
        System.out.println("4. Retirar Vehiculo");
        System.out.println("5. Ver ubicaciones disponibles");
        System.out.println("6. Calcular cobro");
        System.out.println("7. Cierre de caja");
        System.out.println("8. Salir");
        System.out.print("Selecciona una opcion (1-8): ");

        // Leemos la opción del usuario como texto
        String opcion = sc.next();

        // Según la opción, llamamos a la función correspondiente
        switch (opcion) {
            case "1":
                abrirParqueadero();
                break;
            case "2":
                ingresarVehiculo();
                break;
            case "3":
                consultarVehiculo();
                break;
            case "4":
                retirarVehiculo();
                break;
            case "5":
                verUbicacionesDisponibles();
                break;
            case "6":
                calcularCobro();
                break;
            case "7":
                cierreCaja();
                break;
            case "8":
                salir();
                break;
            default:
                System.out.println("Opción invalida, intenta de nuevo.");
                reiniciar();
        }
    }

    // Sale del programa mostrando un mensaje amable
    public static void salir() {
        System.out.println("Gracias por usar el sistema del parqueadero.");
    }

    // Método para regresar al menú luego de una acción
    public static void reiniciar() {
        System.out.println("Presiona Enter para volver al menu...");
        sc.nextLine(); // Limpiamos buffer
        sc.nextLine(); // Esperamos que el usuario presione Enter
        menu();        // Volvemos a mostrar el menú
    }

    // Abre el parqueadero y define la tarifa por hora
    public static void abrirParqueadero() {
        System.out.print("Ingrese la tarifa por hora: ");
        int tarifa = sc.nextInt();

        // Llamamos al método de la clase Parqueadero para abrirlo
        parqueadero.abrirParqueadero(tarifa);
        reiniciar();
    }

    // Ingresar vehículo nuevo solicitando placa y tipo
    public static void ingresarVehiculo() {
        System.out.print("Ingrese la placa del vehiculo: ");
        String placa = sc.next();

        System.out.print("Ingrese el tipo de vehiculo (carro, moto): ");
        String tipo = sc.next();

        // Llamamos al método para agregar vehículo al parqueadero
        parqueadero.ingresarVehiculo(placa, tipo);
        reiniciar();
    }

    // Consultar información de un vehículo por placa
    public static void consultarVehiculo() {
        System.out.print("Ingrese la placa del vehiculo a consultar: ");
        sc.nextLine(); // Limpiar buffer
        String placa = sc.nextLine();

        // Buscamos vehículo con ese número de placa
        Vehiculo v = parqueadero.consultarVehiculo(placa);
        if (v == null) {
            System.out.println("Vehiculo no encontrado.");
        } else {
            // Imprimimos la info usando los métodos get de Vehiculo
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Hora de ingreso: " + v.getHoraIngreso());
        }
        reiniciar();
    }

    // Retirar vehículo del parqueadero, calcular tiempo y cobro
    public static void retirarVehiculo() {
        System.out.print("Ingrese la placa del vehiculo a retirar: ");
        String placa = sc.next();

        // Llamamos al método que hace todo el proceso
        parqueadero.retirarVehiculo(placa);

        reiniciar();
    }

    // Mostrar espacios disponibles en el parqueadero
    public static void verUbicacionesDisponibles() {
        // Calculamos la diferencia entre capacidad total y vehículos dentro
        int disponibles = parqueadero.getCapacidad() - parqueadero.getCantidadVehiculos();
        System.out.println("Espacios disponibles: " + disponibles);
        reiniciar();
    }

    // Calcular el cobro de un vehículo sin retirarlo
    public static void calcularCobro() {
        System.out.print("Ingrese la placa del vehiculo para calcular cobro: ");
        String placa = sc.next();

        Vehiculo v = parqueadero.consultarVehiculo(placa);

        if (v == null) {
            System.out.println("Vehiculo no encontrado.");
        } else {
            // Para calcular cobro, tomamos hora actual como hora de salida
            LocalTime horaSalida = LocalTime.now();
            v.setHoraSalida(horaSalida);

            // Calculamos el tiempo parqueado 
            String tiempoParqueo = v.calcularTiempo();

            // Obtenemos las horas y  las multiplicamos por tarifa
            int horas = v.getTiempoParqueo();
            double total = horas * parqueadero.getTarifaHora();

            System.out.println(tiempoParqueo);
            System.out.println("Total a pagar: $" + total);
        }
        reiniciar();
    }

    // Mostrar el total de dinero en caja y cerrar el parqueadero
    public static void cierreCaja() {
        parqueadero.mostrarCaja();     // Mostrar dinero acumulado
        parqueadero.cerrarParqueadero(); // Cerrar el parqueadero
        reiniciar();
    }
}
