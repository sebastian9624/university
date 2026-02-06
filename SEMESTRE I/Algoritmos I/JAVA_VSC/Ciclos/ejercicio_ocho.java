package Ciclos;

import java.util.Scanner;

public class ejercicio_ocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para almacenar el total percibido por la tienda
        double totalTienda = 0;

        // Procesar las compras de 10 clientes
        System.out.println("Ingrese el peso de naranjas que compran 10 clientes:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Cliente " + i + " - Kilos de naranjas: ");
            double kilos = sc.nextDouble();

            // Precio por kilo de naranjas (supongamos un precio fijo)
            double precioPorKilo = 1.5; // Puedes cambiar este valor si es necesario
            double totalCompra = kilos * precioPorKilo;

            // Aplicar descuento si es necesario
            if (kilos > 10) {
                totalCompra -= totalCompra * 0.15; // Descuento del 15%
            }

            // Imprimir el total a pagar por el cliente
            System.out.println("Cliente " + i + " pagará: " + totalCompra + " unidades monetarias.");

            // Sumar al total percibido por la tienda
            totalTienda += totalCompra;
        }

        // Imprimir el total percibido por la tienda
        System.out.println("\nTotal percibido por la tienda: " + totalTienda + " unidades monetarias.");
    }
}
