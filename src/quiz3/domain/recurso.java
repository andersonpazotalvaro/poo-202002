package quiz3.domain;

public abstract class recurso {
    protected boolean prestado;
    private String nombre;

    public recurso(boolean prestado, String nombre) {
        this.prestado = prestado;
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
