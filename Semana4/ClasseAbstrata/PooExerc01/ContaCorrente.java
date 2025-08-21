package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc01;

public class ContaCorrente extends Conta {
    public ContaCorrente(){
        super();
    }

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void atualizarMensal() {
        double saldo_atual = getSaldo() - 15;
        System.out.printf("Saldo Atual: %.2f\n", saldo_atual);
        setSaldo(saldo_atual);
    }
}

