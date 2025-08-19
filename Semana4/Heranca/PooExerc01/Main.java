package br.com.devsdoagi.Semana4.Heranca.PooExerc01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Alefe", "20014", 2000, 1000);
        c1.sacarComChequeEspecial(500);
        c1.exibirExtrato();

    }
}
