package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc04;

public class Main {
    public static void main(String[] args) {
        ContaBancaria[] contas = {
                new ContaBancaria("Arthur Gomes", 2000),
                new ContaPoupanca("Alefe Damasceno", 2400),
                new ContaCorrente("Ana", 3200)
        };

        for (int i = 0; i < 3; i++) {
            contas[i].gerarRelatorio();
        }
    }
}
