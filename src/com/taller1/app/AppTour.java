package com.taller1.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.taller1.domain.etapa;
import com.taller1.domain.equipo;
import com.taller1.domain.corredor;

public class AppTour {
    public static void main(String[] args){
        etapa paris= new etapa("paris") ;
        equipo losSayayines = new equipo("losSayayines");
        corredor goku = new corredor(35,"goku",1);
        corredor vegeta = new corredor(37,"vegeta",2);
        corredor krilin = new corredor(31,"krilin",3);
        corredor bulma = new corredor(38,"bulma",4);
        corredor gohan = new corredor(22,"gohan",5);
        losSayayines.corredorlist = new ArrayList<>();
        losSayayines.corredorlist.addAll(Arrays.asList(goku,vegeta,krilin,bulma,gohan));

        //losSayayines.getCorredoresOrdenados();



    }



}
