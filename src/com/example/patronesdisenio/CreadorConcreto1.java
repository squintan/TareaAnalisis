package com.example.patronesdisenio;

public class CreadorConcreto1 extends Creador {
    @Override
    public Producto metodoFabrica() {
        return new ProductoConcreto1();
    }
}
