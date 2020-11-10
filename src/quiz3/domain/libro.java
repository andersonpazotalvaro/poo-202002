package quiz3.domain;

public class libro extends recurso implements prestable {

    public libro(boolean prestado, String nombre) {
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
        return "libro {" +
                "nombre = " + this.getNombre() +
                '}';
    }
}
