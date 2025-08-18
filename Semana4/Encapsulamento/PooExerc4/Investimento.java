package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc4;

public class Investimento {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;
    private double montanteFinal;

    public String getTipoInvestimento(){
        return this.tipoInvestimento;
    }
    public void setTipoInvestimento(String tipoInvestimento){
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getValorInicial(){
        return this.valorInicial;
    }
    public void setValorInicial(Double valorInicial){
        if(valorInicial >= 1000){
            this.valorInicial = valorInicial;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public double getTaxaAnual(){
        return this.taxaAnual;
    }
    public void setTaxaAnual(double taxaAnual){
        if (taxaAnual >= 1 && taxaAnual <= 20){
            this.taxaAnual = taxaAnual;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void calcularValorFuturo(int anos){
        double potencia = Math.pow( (1 + this.taxaAnual/100) , anos );
        double montanteFinal = this.valorInicial * potencia;
        this.montanteFinal = montanteFinal;
    }
    public double getValorFuturo(){
        return this.montanteFinal;
    }

    public void exibirResumo(){
        System.out.printf("Investimento: %s\n", getTipoInvestimento());
        System.out.printf("Valor Inicial: R$ %.2f\n", getValorInicial());
        System.out.printf("Taxa Anual: %.2f\n", getTaxaAnual());
        System.out.printf("Valor futuro: R$ %.2f\n", getValorFuturo());
    }
}
