package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc05;

abstract class Cambio {
    private double valorEmReais;
    private double taxaCambio;

    public Cambio(){
        this.valorEmReais = 0.0;
        this.taxaCambio = 0.0;
    }
    public Cambio(double valorEmReais, double taxaCambio){
        this.valorEmReais = valorEmReais;
        this.taxaCambio = taxaCambio;
    }

    public double getValorEmReais(){
        return valorEmReais;
    }
    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public double getTaxaCambio(){
        return taxaCambio;
    }
    public void setTaxaCambio(double taxaCambio){
        this.taxaCambio = taxaCambio;
    }

    public abstract double converter();
}
