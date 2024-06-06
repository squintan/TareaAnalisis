package com.example.patronesdisenio;

public class CreadorConcreto2 extends Creador {
    @Override
    public Producto metodoFabrica() {
        return new ProductoConcreto2();
    }
}
