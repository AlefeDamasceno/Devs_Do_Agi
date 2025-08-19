package br.com.devsdoagi.Semana4.Heranca.PooExerc03;

public class InvestimentoRendaFixa extends Investimento{
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodoMeses){
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double calcularValorFinal(){
        return valorInicial * ( 1 + taxaAnual/100 * ( (double) periodoMeses / 12 ) );
    }
}
