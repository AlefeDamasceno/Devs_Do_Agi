package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc02;

public class Poupanca extends  Investimento{
    public Poupanca(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento(){
        double montante = this.valorAplicado * 0.005;
        return montante;
    }
}
