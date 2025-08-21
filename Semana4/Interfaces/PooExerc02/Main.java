package br.com.devsdoagi.Semana4.Interfaces.PooExerc02;

public class Main {
    public static void main(String[] args) {

        IPagamento pag1 = new PagamentoBoleto();
        IPagamento pag2 = new PagamentoCartao();

        pag1.processarPagamento(200);
        pag2.processarPagamento(300);
    }
}