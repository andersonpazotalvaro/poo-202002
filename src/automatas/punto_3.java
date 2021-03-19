package automatas;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class punto_3 {


    public static void main(String[] args){
        String cadenaEvaluar= JOptionPane.showInputDialog("ingrese la cadena");
        // String cadenaEvaluar="";
         int estadoActual=0;
         boolean esvocal=false;
    for (char caracter: cadenaEvaluar.toCharArray()){

        if (!((caracter >= 'a' && caracter <= 'z'))) {
            estadoActual=-9999;
        }else if(caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'){
                esvocal=true;
            }else{
                 esvocal=false;
             }

        if(estadoActual==0){
            if(esvocal){
                estadoActual=1;
            }else{estadoActual=3;}
        }else if(estadoActual==1){
            if(esvocal){
                estadoActual=2;
            }else {estadoActual=1;}
        }else if(estadoActual==2){
            if(esvocal){
                estadoActual=2;
            }else{estadoActual=1;}
        }else if(estadoActual==3){
            if(esvocal){
                estadoActual=3;
            }else {estadoActual=4;}
        }else if(estadoActual==4){
            if(esvocal){
                estadoActual=3;
            }else {estadoActual=4;}
        }

    }

    if(estadoActual==2 || estadoActual==4){
        System.out.println("la Cadena es Valida");
    }else if(estadoActual==-9999){
        System.out.println("error");
    }else {
        System.out.println("la Cadena NO es valida");
    }




}
}