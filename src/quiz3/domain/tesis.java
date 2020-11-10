package quiz3.domain;

public class tesis extends recurso {
    public tesis(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return "tesis {" +
                "nombre = " + this.getNombre() +
                '}';
    }
}
