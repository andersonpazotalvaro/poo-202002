package quiz3.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


import quiz3.domain.*;

public class appBiblioteca {
    public static void main(String[] args){
        biblioteca alejandria=new biblioteca();

        recurso principito= new libro(false,"el principito");
        alejandria.addRecuros(principito);
        recurso mac= new computador(false,"imac");
        alejandria.addRecuros(mac);
        recurso falabella= new revista(false,"falabella");
        alejandria.addRecuros(falabella);
        recurso relatividad= new tesis(false,"relatividad");
        alejandria.addRecuros(relatividad);
        recurso superman= new historietas(false,"superman");
        alejandria.addRecuros(superman);



        alejandria.prestarRecurso(falabella);
        alejandria.prestarRecurso(superman);
        alejandria.listarPrestados();

        System.out.println("se devolvio superman");
        alejandria.devolverRecurso(superman);
        alejandria.listarPrestados();

        System.out.println(alejandria.listar());

    }
}
