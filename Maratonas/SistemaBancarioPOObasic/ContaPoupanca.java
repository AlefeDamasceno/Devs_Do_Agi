package hackaton.SistemaBancarioPOObasic;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numeroConta,
                         Cliente titular, double valor){
        super(numeroConta, titular, valor);
    }

    public void aplicarJuros(){
        System.out.printf("O juros foi aplicado!\nSaldo " +
                "Atual: R$" +
                " %.2f", getSaldo());
    }
}
