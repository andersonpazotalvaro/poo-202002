package quiz3.domain;

public class revista extends recurso implements prestable {
    public revista(boolean prestado, String nombre) {
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
        return "revista {" +
                "nombre = " + this.getNombre() +
                '}';
    }
}
