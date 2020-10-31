package Desafio2.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


import Desafio2.domain.*;

import javax.swing.*;

public class appempresa {
    public static void main(String[] args){
        nomina nomina=new nomina();
        nomina.empleado=new ArrayList<>();

        empleado juan= new directo("juan",4840000);
        empleado julian= new vendedor("julian",2050000,45510000);
        empleado johana= new freelance("johana",71000,89);
        empleado carolina=new vendedor("carolina",980000,35989000);
        empleado pedro=new promotor("pedro",1200,300,62);
        empleado david=new directo("david",3975000);
        empleado gustavo= new freelance("gustavo",42500,65);

        nomina.empleado.addAll(Arrays.asList(juan, julian, johana, carolina, pedro, david, gustavo));
        System.out.println("los directos son: ");
        nomina.listarDirectos();
        System.out.println("los freelance son: ");
        nomina.listarFreelancers();
        System.out.println("los promotores son: ");
        nomina.listarPromotores();

        System.out.println("la nomina es : ");
        nomina.calcularNomina();


    }
}
