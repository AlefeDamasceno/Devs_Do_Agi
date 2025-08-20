package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc04;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void gerarRelatorio(){
        System.out.printf("Relatório GENÈRICO: %s - Saldo: %.2f\n", this.titular, this.saldo);
    }
}
