package com.taller1.app;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.taller1.domain.*;

public class AppTour {
    public static void main(String[] args){
        //etapa paris= new etapa("paris") ;
        tour francia = new tour("francia");
        equipo colombia = new equipo("colombia");
        corredor jairo = new corredor(35,"jairo",1);
        corredor rigoberto = new corredor(37,"rigoberto",2);
        corredor andres = new corredor(31,"andres",3);
        corredor juan = new corredor(38,"juan",4);
        corredor sara = new corredor(22,"sara",5);
        colombia.corredorlist = new ArrayList<>();
        francia.getEquipos().add(colombia);
       // francia.getEquipos().addAll(Arrays.asList(colombia));
        //francia.getEquipos().addAll(Arrays.asList(colombia));
        //francia.getEtapas().addAll(Arrays.asList(paris));
        colombia.corredorlist.addAll(Arrays.asList(jairo,rigoberto,andres,juan,sara));


        //francia.getCorredoresOrdenadosEdad(colombia);




    }



}
