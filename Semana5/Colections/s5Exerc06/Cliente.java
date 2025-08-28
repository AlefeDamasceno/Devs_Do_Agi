package Semana5.Colections.s5Exerc06;

public class Cliente {
    protected String nome;
    protected double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome(){
        return this.nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
