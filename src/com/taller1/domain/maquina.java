package com.taller1.domain;
import java.util.ArrayList;
import java.util.List;
import com.taller1.domain.productos;

public class maquina {
    private String marca;
    private productos producto;
    public List<productos> productos;
    int total =0;
    int cantidadActual;
    public maquina(String marca) {
        this.marca = marca;
    }

    public void mostrarProductos() {
        productos.forEach(productos -> {
            System.out.println(productos.getNombreProducto());
                });


        }

    public int cantidadtotal() {

        productos.forEach(productos -> {
            total += productos.getCantidadProducto();
            //System.out.println(productos.getNombreProducto());
        });

return total;
    }


    public void  consultarAgotados(){
        productos.forEach(productos -> {
            if(productos.getCantidadProducto()!=0){

            }else {
                System.out.println(productos.getNombreProducto());
            }
        });

    }

    public void consultarCantidad(String nombreProducto ){
        productos.forEach(productos -> {
            if(nombreProducto==productos.getNombreProducto()){

                System.out.println("la cantidad del producto es" );
                System.out.println(productos.getCantidadProducto());
            }


        });

    }


    public void ingresarProducto(String nombreProducto, int cantidadProducto) {

        productos.forEach(productos -> {
            cantidadActual=productos.getCantidadProducto();
            if (nombreProducto==productos.getNombreProducto()){

                if(cantidadActual + cantidadProducto<=8){
                    productos.setCantidadProducto(cantidadActual + cantidadProducto);

                }
                else{
                    System.out.println("sobrepasa la cantidad maxima");
                }
            }
        });



        }



    public void sacarProducto(String nombreProducto, int cantidadProducto) {
        productos.forEach(productos -> {
            cantidadActual=productos.getCantidadProducto();
            if (nombreProducto==productos.getNombreProducto()){

                if(cantidadActual - cantidadProducto>=0){
                    productos.setCantidadProducto(cantidadActual - cantidadProducto);

                }
                else{
                    System.out.println("no hay suficiente productos");
                }
            }
        });
    }

    public String getMarca() {
        return marca;
    }

    public com.taller1.domain.productos getProducto() {
        return producto;
    }

    public List<com.taller1.domain.productos> getProductos() {
        return productos;
    }
}
