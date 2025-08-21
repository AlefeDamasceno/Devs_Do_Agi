package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc01;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        Conta c2 = new COntaPoupanca();

        c1.setSaldo(200);
        c1.atualizarMensal();
        c1.atualizarMensal();
    }
}
