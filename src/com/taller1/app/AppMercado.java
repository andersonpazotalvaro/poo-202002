package com.taller1.app;
import com.taller1.domain.Mercado;
import com.taller1.domain.Productop;
import com.taller1.domain.TipoProducto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppMercado {
    public static void main(String[] args){
        Mercado Anderson = new Mercado("Anderson");
        Anderson.productos = new ArrayList<>();
        Productop buscarCod;
        Productop cerdo= new Productop(1,"lomo", 5,10000, TipoProducto.carne);
        Productop yogur= new Productop(2,"yogur", 20,700, TipoProducto.lacteo);
        Productop tomate= new Productop(3,"tomate", 50,500, TipoProducto.verdura);
        Productop lechuga= new Productop(4,"lechuga", 17,2000, TipoProducto.verdura);
        Productop escoba= new Productop(5,"escoba", 48,15000, TipoProducto.aseo);
        Productop pastel= new Productop(10,"pastel", 80,1500, TipoProducto.pan);



        Anderson.productos.addAll(Arrays.asList(cerdo, yogur, tomate, lechuga, escoba, pastel));
        System.out.println("el valor total es : " + Anderson.calcularTotal());

        //nderson.buscarPorTipo(TipoProducto.verdura);
        buscarCod=Anderson.buscarCodigo(3);
        System.out.println("buscando codigo 3 "+ buscarCod);
        //Productop encontrado;
        //encontrado=Anderson.buscarNombre("yogur");
       // System.out.println("buscando yogur : " + encontrado.getCantidad());



        Productop jabon= new Productop(23,"jabon", 62,5000, TipoProducto.aseo);
        //Anderson.agregar(jabon);


    }
}
