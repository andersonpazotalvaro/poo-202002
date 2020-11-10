package quiz3.domain;

public class historietas extends recurso implements prestable {

    public historietas(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public void prestar() {
        this.prestado=true;
    }

    @Override
    public void devolver() {
        this.prestado=false;
    }

    @Override
    public String toString() {
        return "historieta {" +
                "nombre = " + this.getNombre() +
                '}';
    }
}
