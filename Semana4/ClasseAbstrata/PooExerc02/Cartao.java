package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc02;

abstract class Cartao {
    private String numero;
    private double limite;

    public Cartao(){
        this.numero = null;
        this.limite = 0;
    }
    public Cartao(String numero, double limite){
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }

    public abstract void processarCompra(double valor);
}
