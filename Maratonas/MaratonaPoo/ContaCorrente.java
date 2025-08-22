package br.com.devsdoagi.Maratonas.MaratonaPoo;

public class ContaCorrente extends Conta{
    public ContaCorrente(){
        super();
    }

    public ContaCorrente(String numeroConta, Cliente titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    @Override
    public void aplicarJuros(){
        System.out.printf("Juros Aplicados!\nSaldo Atual: R$ %.2f\n", getSaldo());
    }
}
