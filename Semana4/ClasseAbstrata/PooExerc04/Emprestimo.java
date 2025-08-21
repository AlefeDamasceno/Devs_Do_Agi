package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc04;

abstract class Emprestimo {
    protected double valor;
    protected double taxaJuros;

    public Emprestimo(){
        this.valor = 0.0;
        this.taxaJuros = 0.0;
    }
    public Emprestimo(double valor, double taxaJuros){
        this.valor = valor;
        this.taxaJuros = taxaJuros;
    }

    public abstract double calcularParcela(int meses);
}
