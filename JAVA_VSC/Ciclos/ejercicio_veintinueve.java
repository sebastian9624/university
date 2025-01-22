package Ciclos;

import java.util.Scanner;

public class ejercicio_veintinueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializar variables
        double totalGalones = 0;
        double totalDineroUltimos10Clientes = 0;
        
        // Variables para almacenar los galones y el dinero pagado por los últimos 10 clientes
        double[] dineroClientes = new double[10]; // Array para los últimos 10 clientes

        // Leer datos de 30 autos
        for (int i = 1; i <= 30; i++) {
            System.out.print("Ingrese los galones consumidos por el auto " + i + ": ");
            double galones = sc.nextDouble();
            totalGalones += galones; // Sumar galones consumidos

            // Leer el dinero pagado por el cliente
            System.out.print("Ingrese el precio pagado por el auto " + i + ": ");
            double precioPagado = sc.nextDouble();
            
            // Almacenar el dinero pagado en el array de los últimos 10 clientes
            if (i > 20) { // Guardar solo para los últimos 10 clientes
                dineroClientes[i - 21] = precioPagado; // Guardar en el índice correspondiente
            }
        }

        // Calcular el total de dinero pagado por los últimos 10 clientes
        for (double dinero : dineroClientes) {
            totalDineroUltimos10Clientes += dinero; // Sumar el dinero de los últimos 10 clientes
        }

        // Mostrar resultados
        System.out.println("Total de galones consumidos por los últimos 30 autos: " + totalGalones);
    }
}
