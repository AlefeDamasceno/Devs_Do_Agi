package hackaton.SistemaBancarioPOObasic;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numeroConta,
                         Cliente titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    public void aplicarJuros(){
        setSaldo(getSaldo()*1.01);
        System.out.printf("Juros Aplicados! Saldo Atual:" +
                " R$ %.2f", getSaldo());
    }
}
