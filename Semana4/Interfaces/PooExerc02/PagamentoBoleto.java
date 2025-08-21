package br.com.devsdoagi.Semana4.Interfaces.PooExerc02;

public class PagamentoBoleto implements IPagamento{

    @Override
    public void processarPagamento(double valor){
        System.out.printf("Pagamento de valor: R$ %.2f - Via Boleto Bancário.\n", valor);
    }
}
