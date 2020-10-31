package Desafio2.domain;

public class directo extends empleado {
private long salario;

    public directo(String nombre, long salario) {
        super(nombre);
        this.salario=salario;
    }

    public long calcularSalud(){
        return (long) (this.salario*0.05);
    }

    public long calcularPension(){
        return (long) (this.salario*0.065);
    }

    @Override
    public long calcularSalario() {
        return this.salario-this.calcularPension()-this.calcularSalud();
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}
