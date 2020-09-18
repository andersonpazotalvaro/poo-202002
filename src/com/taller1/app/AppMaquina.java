package com.taller1.app;
import com.taller1.domain.maquina;
import java.util.ArrayList;
import java.util.Arrays;

import com.taller1.domain.productos;

public class AppMaquina {
    public static void main(String[] args){
        int cantidadtotal;

        productos coca= new productos("cocacola",6);
        productos choco= new productos("chocolatina", 8);
        productos papita= new productos("papitas", 0);
        //maquina uco = new maquina();
        maquina uco = new maquina("uco");
        uco.productos = new ArrayList<>();
        uco.getProductos().addAll(Arrays.asList(coca,choco,papita));
        System.out.println("la cantidad de productos es : " + uco.productos.size());
        System.out.println("los productos son : ");uco.mostrarProductos();
        System.out.println("los productos agotados son : ");uco.consultarAgotados();


        cantidadtotal = uco.cantidadtotal();
        System.out.println("la cantidad total de productos es : ");
        System.out.println(cantidadtotal);

        uco.ingresarProducto("papitas",5 );
        System.out.println("los productos agotados son : ");uco.consultarAgotados();

        uco.sacarProducto("cocacola", 6);
        System.out.println("los productos agotados son : ");uco.consultarAgotados();

        uco.consultarCantidad("chocolatina");
    }
}

