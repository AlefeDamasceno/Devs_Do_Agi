package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc02;

public class Investimento {
    protected double valorAplicado;

    public Investimento(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento(){
        return 0;
    }
}
