package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc1;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    private double getSaldo(){
        return this.saldo;
    }

    public void Depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void Sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo é menor que valor!");
        }
    }

    public void exibirInformacoes(){
        System.out.printf("Nome Titular: %s\n", getTitular());
        System.out.printf("Numero Conta: %s\n", getNumeroConta());
        System.out.printf("Saldo Atual: %.2f\n", getSaldo());
    }
}
