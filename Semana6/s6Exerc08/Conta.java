package Semana6.s6Exerc08;

public class Conta {
    private String titular;
    private double saldo;
    private int agencia;
    private String tipo; // "corrente" ou "poupanca"

    public Conta(String titular, double saldo, int agencia, String tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

