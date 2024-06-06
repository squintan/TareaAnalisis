package com.example.patronesdisenio;

public class Main {
    public static void main(String[] args) {
        // Uso del Singleton
        Singleton singleton = Singleton.obtenerInstancia();
        singleton.mostrarMensaje();

        // Uso del Método de Fábrica
        Creador creador1 = new CreadorConcreto1();
        creador1.usarProducto(); // Outputs: Usando ProductoConcreto1

        Creador creador2 = new CreadorConcreto2();
        creador2.usarProducto(); // Outputs: Usando ProductoConcreto2
    }
}
