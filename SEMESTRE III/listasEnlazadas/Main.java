//package SEMESTRE III.listasEnlazadas;

// Clase Nodo: Representa un elemento de la lista
class Nodo {
    int dato;        // Valor que guarda el nodo
    Nodo siguiente;  // Apunta al siguiente nodo

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null; // Cuando se crea, no apunta a nada
    }
}

// Clase ListaEnlazada: Maneja los nodos
class ListaEnlazada {
    Nodo cabeza; // Primer nodo de la lista

    // Agregar un elemento al final de la lista
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) { // Si la lista está vacía
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) { // Avanza hasta el último
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo; // Enlaza el último con el nuevo
        }
    }

    // Mostrar todos los elementos
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente; // Avanzar al siguiente nodo
        }
        System.out.println("null");
    }
}

// Clase principal para probar la lista
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        lista.mostrar(); // Salida: 10 -> 20 -> 30 -> null
    }
}
