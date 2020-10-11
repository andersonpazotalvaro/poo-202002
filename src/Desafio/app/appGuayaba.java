package Desafio.app;
import Desafio.domain.Guayaba;
import Desafio.domain.jugador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class appGuayaba {
    public static void main(String[] args){
        Guayaba guayaba= new Guayaba();
        guayaba.jugador = new ArrayList<>();

        int bienvenida = JOptionPane.showOptionDialog(null, "Bienvenido a guayabita \n que quieres hacer?", "Guayabita", 0,
                0, null, Arrays.asList("Jugar", "Intrucciones").toArray(), "Jugar");

        if (bienvenida==0){

            int numeroJugadores=  Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero de jugadores"));

            Guayaba jugadores=new Guayaba();
            jugador jugadorNuevo;

                for(int i=0;i<numeroJugadores;i++){

                    String nombreJugador=JOptionPane.showInputDialog(null, "ingrese nombre de jugador"+(i+1));
                    int dineroJugador=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el dinero del jugador"+(i+1)));

                    jugadorNuevo=new jugador(nombreJugador,dineroJugador);
                    guayaba.jugador.addAll(Arrays.asList(jugadorNuevo));

                    //jugadores.jugador.add(jugadorNuevo);
            }

        }else{

        }
        guayaba.mostrarjugador();

    }
}
