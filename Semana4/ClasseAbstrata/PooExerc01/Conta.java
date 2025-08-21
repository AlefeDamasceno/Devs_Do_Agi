package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc01;

abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta() {
        this.numero = null;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public abstract void atualizarMensal();
}
