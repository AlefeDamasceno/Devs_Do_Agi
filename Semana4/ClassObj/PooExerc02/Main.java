package br.com.devsdoagi.Semana4.ClassObj.PooExerc02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.titular = "Alefe GOmes";
        minhaConta.numeroConta = "1322";
        minhaConta.saldo = 1000;

        minhaConta.depositar(200);
        minhaConta.sacar(100);

        minhaConta.exibirSaldo();
    }



}
