package br.com.devsdoagi.Semana4.Interfaces.PooExerc01;

public class Main {
    public static void main(String[] args) {
        IDescontavel p1 = new ProdutoComum();
        IDescontavel p2 = new ProdutoPromocional();

        double precoProdutoComum = p1.calcularPrecoFinal(200);
        double precoProdutoPromocional = p2.calcularPrecoFinal(200);
        System.out.printf("Prod. Comum - %.2f\nProd. Promo. %.2f", precoProdutoComum, precoProdutoPromocional);

    }
}
