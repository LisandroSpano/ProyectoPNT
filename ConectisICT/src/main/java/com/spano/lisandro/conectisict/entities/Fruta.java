
package com.spano.lisandro.conectisict.entities;

public class Fruta extends Producto{
    
    //Atributos
   private String unidadDeVenta;
    
    //Metodos

    public Fruta(String nombre, String unidadDeVenta, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }
   

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + unidadDeVenta;
    }
    
    
    
    
    
}
