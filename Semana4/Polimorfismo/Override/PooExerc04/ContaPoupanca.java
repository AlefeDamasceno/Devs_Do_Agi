package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc04;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular ,double saldo){
        super(titular, saldo);
    }
    @Override
    public void gerarRelatorio(){
        System.out.printf("Titular: %s - Saldo: R$ %.2f - rendimento Mensal: R$ %.2f\n", this.titular, this.saldo, this.saldo*0.005);
    }
}
