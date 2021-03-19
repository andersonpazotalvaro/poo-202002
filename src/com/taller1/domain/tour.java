package com.taller1.domain;

import java.util.Comparator;
import java.util.List;

public class tour {
    public String nombreTour;
private List<equipo> equipos;
private List<etapa> etapas;
private List<corredor> todosCorredores;

    public tour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public List<equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<equipo> equipos) {
        this.equipos = equipos;
    }

    public List<etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<etapa> etapas) {
        this.etapas = etapas;
    }

    public List<corredor> getTodosCorredores() {
        return todosCorredores;
    }

    public void setTodosCorredores(List<corredor> todosCorredores) {
        this.todosCorredores = todosCorredores;
    }

    public void getCorredoresOrdenadosEdad(equipo e){
        // equipo corredoresOrdenadoss= e;
        List<corredor>corredoresOrdenaros;
        corredoresOrdenaros= (List<corredor>) e.getCorredorlist().stream().sorted(Comparator.comparing(corredor::getEdad));


      /*corredoresOrdenaross= corredorlist.stream().sorted(corredoresOrdenaros.));
      corredorlist=corredoresOrdenaros;*/
        corredoresOrdenaros.forEach(corredor -> {
            System.out.println(corredor.getNombre());
            System.out.println(corredor.getEdad());
        });

    }

}
