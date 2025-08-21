package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc03;

public abstract class Investimento {
    private double valorAplicado;

    public Investimento(){
        this.valorAplicado = 0;
    }
    public Investimento(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }

    public double getvalorAplicado(){
        return valorAplicado;
    }
    public void setValorAplicado(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }

    public abstract double calcularRendimento();
}
