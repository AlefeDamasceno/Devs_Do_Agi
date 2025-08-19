package br.com.devsdoagi.Semana4.Heranca.PooExerc03;

public class Main {
    public static void main(String[] args) {
        InvestimentoRendaFixa invest1 = new InvestimentoRendaFixa("001", 2000, 3, 24);
        double valor_final = invest1.calcularValorFinal();
        System.out.printf("Valor Final do Investimento: %.2f", valor_final);
    }
}
