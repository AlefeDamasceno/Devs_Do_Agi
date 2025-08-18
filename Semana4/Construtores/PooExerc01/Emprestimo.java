package br.com.devsdoagi.Semana4.Construtores.PooExerc01;

public class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int prazoMeses;

    public Emprestimo(double valor, int prazoMeses){
        this.valor = valor;
        this.prazoMeses = prazoMeses;
        this.taxaJuros = 1.5;
    }

    public Emprestimo(double valor, double taxaJuros, int prazoMeses){
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
    }
}
