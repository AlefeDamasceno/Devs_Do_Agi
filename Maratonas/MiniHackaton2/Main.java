package br.com.devsdoagi.Maratonas.MiniHackaton2;

public class Main {
    public static void main(String[] args) {
        Investimento[] investimentos = {
                new RendaFixa(1000),
                new RendaVariavel(1000),
        };

        for (int i = 0; i < investimentos.length; i++) {
            System.out.printf("Retorno invest %d: %.2f\n", i+1, investimentos[i].calcularRendimento());;
        }
    }
}
