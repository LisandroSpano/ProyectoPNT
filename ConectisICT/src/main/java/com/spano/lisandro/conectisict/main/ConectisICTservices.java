package com.spano.lisandro.conectisict.main;

import com.spano.lisandro.conectisict.entities.Bebida;
import com.spano.lisandro.conectisict.entities.Fruta;
import com.spano.lisandro.conectisict.entities.Perfumeria;
import com.spano.lisandro.conectisict.entities.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConectisICTservices {
   
    private static List<Producto>lista; 
   
    public static void cargar(){
        lista=new ArrayList();
        lista.add(new Bebida("Coca-Cola Zero", 1.5f, 20));
        lista.add(new Bebida("Coca-Cola", 1.5f, 18));
        lista.add(new Perfumeria("Shampoo Sedal", "500ml", 19));
        lista.add(new Fruta("Frutillas", "kilo", 64));
    }
    
    public static void main(String[] args) {
        
        cargar();
        
        lista.forEach(System.out::println);
        System.out.println("=============================");
        
        Set<Producto>set=new TreeSet();
        set.addAll(lista);
        
        List<Producto> lista2=new ArrayList();
        lista2.addAll(set);
        
        System.out.println("Producto más caro: "+lista2.get(lista2.size()-1).getNombre());
        System.out.println("Producto más barato: "+lista2.get(0).getNombre());

    }
}
