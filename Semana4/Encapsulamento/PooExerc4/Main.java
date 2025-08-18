package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc4;

public class Main {
    public static void main(String[] args) {
        Investimento invest1 = new Investimento();

        invest1.setTipoInvestimento("poupança");
        invest1.setTaxaAnual(20);
        invest1.setValorInicial(1000.0);

        invest1.calcularValorFuturo(2);

        invest1.exibirResumo();
    }
}
