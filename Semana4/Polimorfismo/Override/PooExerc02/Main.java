package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc02;

public class Main {
    public static void main(String[] args) {
        Investimento[] investimentos = {
                new Poupanca(4000),
                new CDB(5200)
        };

        for (int i = 0; i < investimentos.length; i++) {
            System.out.printf("%.2f\n",investimentos[i].calcularRendimento());
        }
    }
}
