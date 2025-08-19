package br.com.devsdoagi.Semana4.Heranca.PooExerc01;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial){
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacarComChequeEspecial(double valor){
        if (limiteChequeEspecial >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque não permitido!");
        }
    }
    public void exibirExtrato(){
        System.out.printf("TItular: %s\n", this.titular);
        System.out.printf("Numero Conta: %s\n", this.numeroConta);
        System.out.printf("Saldo Atual: %.2f\n", this.saldo);
    }
}
