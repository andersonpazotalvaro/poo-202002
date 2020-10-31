package Desafio2.domain;

public abstract class empleado {
   private String nombre;

    public empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract long calcularSalario();
}

