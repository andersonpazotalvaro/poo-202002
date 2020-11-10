package quiz3.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class biblioteca {
    private String nombre;
    private List<recurso> recursos;


    public biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void addRecuros(recurso recursoAIngresar) {
        boolean existe = recursos.stream().filter(v -> v.getNombre() == recursoAIngresar.getNombre()).findAny().isPresent();

        if (!existe) {
            this.recursos.add(recursoAIngresar);
        }
    }

    public boolean prestarRecurso(recurso R) {
        AtomicBoolean sw= new AtomicBoolean(false);
        this.recursos.forEach(recursoAPrestar -> {
            if (recursoAPrestar instanceof prestable && recursoAPrestar.getNombre()== R.getNombre() && recursoAPrestar.prestado==false) {
                ((prestable) recursoAPrestar).prestar();
                sw.set(true);
            }
        });

        if(sw.get()){
            return true;
        }return false;
    }

    public boolean devolverRecurso(recurso R) {
        AtomicBoolean sw= new AtomicBoolean(false);
        this.recursos.forEach(recursoADevolver -> {
            if (recursoADevolver instanceof prestable && recursoADevolver.getNombre()== R.getNombre() && recursoADevolver.prestado==true) {
                ((prestable) recursoADevolver).devolver();
                sw.set(true);
            }
        });

        if(sw.get()){
            return true;
        }return false;
    }

    public void listarPrestados() {

        this.recursos.forEach(listar -> {
            if (listar.prestado==true) {
                System.out.println(listar.getNombre());
                if(listar instanceof libro){
                    System.out.println("Libro");
                }
                if(listar instanceof revista){
                    System.out.println("revista");
                }
                if(listar instanceof historietas){
                    System.out.println("historieta");
                }
                if(listar instanceof tesis){
                    System.out.println("tesis");
                }
                if(listar instanceof computador){
                    System.out.println("computador");
                }
            }
        });
    }

    public List<recurso> listar() {
        return this.recursos;
    }

}
