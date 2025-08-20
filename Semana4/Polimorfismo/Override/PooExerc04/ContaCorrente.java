package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc04;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("Conta corrente:");
        System.out.printf("Titular: %s - Saldo: %.2f - Desconto taxa Manu. R$ 20.00!\n", this.titular, this.saldo);
    }
}
