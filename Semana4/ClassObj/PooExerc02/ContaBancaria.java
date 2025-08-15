package br.com.devsdoagi.Semana4.ClassObj.PooExerc02;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public void depositar(double valor){
        System.out.printf("R$ %.2f foram depositados!\n", valor);
        saldo += valor;
    }

    public void sacar(double valor){
        System.out.printf("R$ %.2f foram sacados!\n", valor);
        saldo -= valor;
    }

    public void exibirSaldo(){
        System.out.printf("\nSaldo Atual: R$ %.2f\n", saldo);
    }
}
