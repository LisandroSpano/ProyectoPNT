package com.spano.lisandro.conectisict.entities;

public class Perfumeria extends Producto {

    private String contenido;

    public Perfumeria(String nombre, String contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + contenido + " /// Precio: $" + getPrecio();
    }
}
