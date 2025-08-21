package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc01;

public class COntaPoupanca extends Conta{
    public COntaPoupanca(){
        super();
    }

    public COntaPoupanca(String numero, double saldo){
        super(numero, saldo);
    }
    @Override
    public void atualizarMensal(){
        double saldo_atual = getSaldo() * 1.005;
        System.out.printf("Saldo Atual: %.2f\n", saldo_atual);
        setSaldo(saldo_atual);
    }
}
