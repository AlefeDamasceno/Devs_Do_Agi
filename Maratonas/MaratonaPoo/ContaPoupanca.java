package br.com.devsdoagi.Maratonas.MaratonaPoo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(String numeroConta, Cliente titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    @Override
    public void aplicarJuros(){
        double saldoAtual = getSaldo() * 1.01;
        setSaldo(saldoAtual);
        System.out.printf("Juros Aplicados!\nSaldo Atual: R$ %.2f", getSaldo());
    }
}
