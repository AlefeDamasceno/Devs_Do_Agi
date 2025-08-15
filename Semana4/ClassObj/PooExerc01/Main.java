package br.com.devsdoagi.Semana4.ClassObj.PooExerc01;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();

        prod.nome = "Batata";
        prod.preco = 5.2;
        prod.quantidade = 8;

        prod.exibirDados();

        prod.adicionarEstoque(2);
        prod.removerEstoque(8);

        prod.exibirDados();
    }
}
