package Desafio.domain;

import java.util.Random;
import javax.swing.*;

public class jugador {
    private String nombre;
    private int dinero;


    public int tirarDado() {
        int dado;
        dado = (int) Math.floor(Math.random()*6+1);
        return dado;
    }






    public jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
