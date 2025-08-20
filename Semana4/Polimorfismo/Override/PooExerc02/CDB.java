package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc02;

public class CDB extends Investimento{
    public CDB(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento(){
        double montante = this.valorAplicado * 0.01;
        return montante;
    }
}
