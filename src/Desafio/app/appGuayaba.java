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
        int pote=0;
        int Dineroactual=0;
        String nombre;
        int val=0;
        int apuesta=0, pote2=0;
        Icon guayaIcon = new ImageIcon(appGuayaba.class.getResource("guayaba.jpg"));

        Icon Dado;

        int bienvenida = JOptionPane.showOptionDialog(null, "Bienvenido a guayabita \n que quieres hacer?", "Guayabita", 0,
                0, guayaIcon, Arrays.asList("Jugar", "Intrucciones").toArray(), "Jugar");

        if (bienvenida==0){

            int numeroJugadores=  Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero de jugadores"));

            Guayaba jugadores=new Guayaba();
            jugador jugadorNuevo=null;


                for(int i=0;i<numeroJugadores;i++){

                    String nombreJugador=JOptionPane.showInputDialog(null, "ingrese nombre de jugador"+(i+1));
                    int dineroJugador=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el dinero del jugador"+(i+1)));
                    jugadorNuevo=new jugador(nombreJugador,dineroJugador-500);
                    guayaba.jugador.addAll(Arrays.asList(jugadorNuevo));
                    val+=500;
                    guayaba.setPote(val);
                    //pote +=500;
                    //jugadores.jugador.add(jugadorNuevo);
            }

                do {
                    for(int i=0;i<numeroJugadores;i++){
                        if(guayaba.jugador.get(i).getDinero()!=0){
                         nombre=guayaba.jugador.get(i).getNombre();
                         Dineroactual=guayaba.jugador.get(i).getDinero();

                        int DeseaJugar = JOptionPane.showOptionDialog(null, nombre+", el pote actual es de : " + guayaba.getPote()+" desea lanzar el dado?", "Guayabita", 0,
                                0, null, Arrays.asList("si", "no").toArray(), "si");
                        if (DeseaJugar==0){
                            int DadoInicial= jugadores.tirarDado();
                            //jugadores.getIcon(DadoInicial);
                            if(DadoInicial!=1 && DadoInicial!=6){
                            int DeseaApostar = JOptionPane.showOptionDialog(null, nombre+", este es tu dado " + DadoInicial+" desea hacer una apuesta? " , "Guayabita", 0,
                                    0, jugadores.getIcon(DadoInicial), Arrays.asList("si", "no").toArray(), "si");
                                if(DeseaApostar==0){
                                    int ApuestaJugador;
                                    do{
                                    ApuestaJugador=Integer.parseInt(JOptionPane.showInputDialog(null, nombre+", cuanto desea apostar? \n su dinero es "+Dineroactual+ "\n (el pote esta en "+ guayaba.getPote()+")"));
                                    }while(ApuestaJugador>guayaba.getPote());
                                    int DadoSegundo= jugadores.tirarDado();

                                    if (DadoSegundo>DadoInicial){
                                        //JOptionPane.showMessageDialog(null,DadoSegundo+" has ganado");
                                        JOptionPane.showMessageDialog(null,DadoSegundo+" has ganado", "ganaste",0,jugadores.getIcon(DadoSegundo));
                                        apuesta = guayaba.jugador.get(i).getDinero()+ApuestaJugador;
                                        guayaba.jugador.get(i).setDinero(apuesta);
                                        pote2 = guayaba.getPote()-ApuestaJugador;
                                        guayaba.setPote(pote2);
                                        if(guayaba.getPote()==0){
                                            break;
                                        }

                                    }else {
                                        //JOptionPane.showMessageDialog(null,DadoSegundo+" has perdido");
                                        JOptionPane.showMessageDialog(null,DadoSegundo+" has perdido", "perdiste",0,jugadores.getIcon(DadoSegundo));
                                        apuesta = guayaba.jugador.get(i).getDinero()-ApuestaJugador;
                                        guayaba.jugador.get(i).setDinero(apuesta);
                                        pote2 = guayaba.getPote()+ApuestaJugador;
                                        guayaba.setPote(pote2);
                                    }

                                }
                            }else{
                                JOptionPane.showConfirmDialog(null,"Su dado fue "+DadoInicial+ "cede turno");
                                JOptionPane.showMessageDialog(null,"Su dado fue "+DadoInicial+ "cede turno", "Cede turno",0,jugadores.getIcon(DadoInicial));
                            }
                        }
                    }
                    }


                }while(guayaba.getPote()!=0 || guayaba.TienenDinero()!=false );
        }else{
            JOptionPane.showMessageDialog(null,"instruciones asdasd");
        }
        String str= guayaba.imprimirJug();
        guayaba.mostrarjugador();
        JOptionPane.showMessageDialog(null,""+str);


    }
}
