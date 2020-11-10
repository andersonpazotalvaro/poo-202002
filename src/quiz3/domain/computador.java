package quiz3.domain;

public class computador extends recurso {
    public computador(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return "computador {" +
                "nombre = " + this.getNombre() +
                '}';
    }
}
