package com.example.patronesdisenio;

public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Singleton");
    }
}
