package Desafio2.domain;

public class vendedor extends directo{
    private long ventasDelMes;
    public vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes=ventasDelMes;
    }

    public long calcularComision(){
        if (getSalario()<=999999){
            return (long) (ventasDelMes*0.04);
        }else{
            return (long) (ventasDelMes*0.035);
        }
    }
    @Override
    public long calcularSalario() {
        return this.getSalario()-this.calcularPension()-this.calcularSalud()+calcularComision();
    }
}
