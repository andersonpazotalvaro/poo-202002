package com.taller1.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mercado {
    public static byte capacidad = 98;
    private String supermercado;
    private Productop producto;
    public List<Productop> productos;

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
    }

    boolean seAgrego = false;
    public boolean agregar(Productop nombreProducto){

        productos.forEach(productos -> {
            if (nombreProducto.getCodigo()!=productos.getCodigo()){

                if(nombreProducto.getCantidad() <=capacidad){
                    this.productos.add(nombreProducto);


                    seAgrego=true;

                }
                else{
                    System.out.println("sobrepasa la cantidad maxima");
                    seAgrego=false;
                }
            }else{
                System.out.println("El codigo ya existe");
                seAgrego=false;
            }

        });
        return seAgrego;
    }
    boolean seRetiro = false;
    public boolean retirar(String nombreProducto){

        productos.forEach(productos -> {
            if (nombreProducto==productos.getNombre()){

                this.productos.remove(productos);
                seRetiro=true;
            }else{
                System.out.println("El producto no existe");
                seRetiro=false;
            }

        });
        return seRetiro;
    }


    public Productop buscarNombre(String nombre){
        Productop productoEncontrado=null;
        productos.forEach(productos -> {
            if(productos.getNombre() == nombre){
                //Productop productoEncontrado=null;
                Productop productoEntontrado = new Productop(productos.getCodigo(), productos.getNombre(), productos.getCantidad(), productos.getPrecio(), productos.getTipo());
                System.out.println("se encontro");

            }
        });
    return productoEncontrado;
    }

    public Productop buscarCodigo(int codigo){
        Productop encontrado = null;
        productos.forEach(productos -> {
            if(productos.getCodigo() == codigo){
                encontrado.setNombre(productos.getNombre());
                encontrado.setCantidad(productos.getCantidad());
                encontrado.setCodigo(productos.getCodigo());
                encontrado.setPrecio(productos.getPrecio());
                encontrado.setTipo(productos.getTipo());
                 //encontrado= new Productop(productos.getCodigo(),productos.getNombre(),productos.getCantidad(),productos.getPrecio(),productos.getTipo());

            }
        });
        return encontrado;

    }

    public List<Productop> buscarPorTipo(String tipo){


            List<Productop> productosTipo = null;
            productos.forEach(productos -> {
                if(productos.getTipo() == tipo){
                    productosTipo.add(productos);


                }
            });
            return productosTipo;
    }
    int total, sumtotal;
    public int calcularTotal(){

        productos.forEach(productos -> {
            total=productos.getPrecio() * productos.getCantidad();
            sumtotal += total;
        });
        return sumtotal;
    }


}
