package Desafio2.domain;
import java.util.List;
import java.util.ArrayList;

import Desafio2.domain.empleado;

public class nomina {
    public empleado empleados;
    public List<empleado> empleado;

    public void calcularNomina(){
        empleado.forEach(empleado->{
            System.out.println(empleado.getNombre());
            System.out.println(empleado.calcularSalario());
        });
    }

    public void listarDirectos(){

            empleado.forEach(empleado -> {
                if (empleado instanceof directo) {
                    System.out.println(empleado.getNombre());
                }
            });

    }
    public void listarFreelancers(){
        empleado.forEach(empleado -> {
            if (empleado instanceof freelance) {
                System.out.println(empleado.getNombre());
            }
        });

    }
    public void listarPromotores(){
        empleado.forEach(empleado -> {
            if (empleado instanceof promotor) {
                System.out.println(empleado.getNombre());
            }
        });

    }

}
