import java.util.Scanner;

public class cadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre ="", apellido="", completo ="";
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        completo = nombre + " " + apellido;
        System.out.println("Su nombre completo es: " + completo);
    }
}