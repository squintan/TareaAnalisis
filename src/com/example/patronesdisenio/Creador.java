package com.example.patronesdisenio;

public abstract class Creador {
    public abstract Producto metodoFabrica();

    public void usarProducto() {
        Producto producto = metodoFabrica();
        producto.usar();
    }
}
