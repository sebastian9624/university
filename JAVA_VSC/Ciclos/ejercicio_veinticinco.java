package Ciclos;

import java.util.Scanner;

public class ejercicio_veinticinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer el número de segundos
        System.out.print("Ingrese un número entero de segundos: ");
        int segundos = sc.nextInt();

        // Calcular horas, minutos y segundos
        int horas = segundos / 3600; // 1 hora = 3600 segundos
        int minutos = (segundos % 3600) / 60; // 1 minuto = 60 segundos
        int segundosRestantes = segundos % 60; // Segundos restantes

        // Mostrar el resultado
        System.out.println(segundos + " segundos son equivalentes a: ");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");
    }
}
