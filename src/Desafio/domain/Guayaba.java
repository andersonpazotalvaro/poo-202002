package Desafio.domain;
import java.util.List;
import java.util.ArrayList;
import Desafio.domain.jugador;

public class Guayaba {
    public jugador jugadores;
    public List<jugador> jugador;
    int pote =0;
    int Apuesta=0;


    public void mostrarjugador() {
        jugador.forEach(jugadores -> {
            System.out.println(jugadores.getNombre());
            System.out.println(jugadores.getDinero());
        });


    }


}
