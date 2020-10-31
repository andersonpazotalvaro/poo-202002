package Desafio.domain;
import java.util.List;
import java.util.ArrayList;

import Desafio.app.appGuayaba;
import Desafio.domain.jugador;

import javax.swing.*;

public class Guayaba {
    public jugador jugadores;
    public List<jugador> jugador;
    int pote =0;
    int Apuesta=0;
    int total=0;

    Icon dado1 = new ImageIcon(appGuayaba.class.getResource("dado1.jpg"));
    Icon dado2 = new ImageIcon(appGuayaba.class.getResource("dado2.jpg"));
    Icon dado3 = new ImageIcon(appGuayaba.class.getResource("dado3.jpg"));
    Icon dado4 = new ImageIcon(appGuayaba.class.getResource("dado4.jpg"));
    Icon dado5 = new ImageIcon(appGuayaba.class.getResource("dado5.jpg"));
    Icon dado6 = new ImageIcon(appGuayaba.class.getResource("dado6.jpg"));

    public Icon getIcon(int a){

        Icon ret = null;
        if(a==1){
            ret = dado1;
        }
        if(a==2){
            ret = dado2;
        }
        if(a==3){
            ret = dado3;
        }
        if(a==4){
            ret = dado4;
        }
        if(a==5){
            ret = dado5;
        }
        if(a==6){
            ret = dado6;
        }
        return ret;
    }

    public boolean TienenDinero() {

        jugador.forEach(jugador -> {
            if(jugador.getDinero()!=0){
                total+=1;

            }

        });
        if(total==1){
            return true;
        }else {return false;}

    }

    public int tirarDado() {
        int dado;
        dado = (int) Math.floor(Math.random()*6+1);
        return dado;
    }



    public int getPote() {
        return pote;
    }

    public void setPote(int pote) {
        this.pote = pote;
    }

    public int getApuesta() {
        return Apuesta;
    }

    public void setApuesta(int apuesta) {
        Apuesta = apuesta;
    }

    public void mostrarjugador() {
        jugador.forEach(jugadores -> {
            System.out.println(jugadores.getNombre());
            System.out.println(jugadores.getDinero());
        });


    }
    String b = "";
    public String imprimirJug(){

        jugador.forEach(jugadores -> {
            b=b+jugadores.getNombre()+"\n"+jugadores.getDinero()+"\n";
        });
        return b;
    }


}
