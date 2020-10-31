package Desafio2.domain;

public class freelance extends empleado {
    private long valorHora;
    private int horasTrabajadas;

    public freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }

    @Override
    public long calcularSalario() {

        return this.valorHora*this.horasTrabajadas;
    }

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
