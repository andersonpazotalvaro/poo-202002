package com.taller1.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class equipo {
    private String nombreEquipo;
    public List<corredor>corredorlist;

    public equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /*public static void getCorredoresOrdenados(List<corredor> lista){
        int clave, i;
        int n=lista.size();
        for (int j=1;j<n;j++){
            clave = lista.indexOf(j);
            i=j-1;

        }
    }*/


    /*public void getCorredoresOrdenados(){
       List<corredor>corredoresOrdenaros;
       corredoresOrdenaros=corredorlist;
       corredoresOrdenaros=corredoresOrdenaros.stream(corredoresOrdenaros).sorted(;
      corredoresOrdenaros= corredoresOrdenaros.stream().sorted());
      corredorlist=corredoresOrdenaros;
        corredoresOrdenaros.forEach(corredor -> {
            System.out.println(corredor.getNombre());
            System.out.println(corredor.getEdad());
        });

  }*/


    public List<corredor> getCorredorlist() {
        return corredorlist;
    }

    public void setCorredorlist(List<corredor> corredorlist) {
        this.corredorlist = corredorlist;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
}
