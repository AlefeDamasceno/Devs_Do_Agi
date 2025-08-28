package br.com.devsdoagi.Semana5.Colections.s5exerc05;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Produto> estoque = new HashMap<>();

        cadastrarProdutos(estoque, "001", "Batata", 4);
        cadastrarProdutos(estoque, "002", "Maça", 7);
        cadastrarProdutos(estoque, "003", "Feijão", 2);
        exibirProdutos(estoque);

        buscarPorCodigo(estoque, "004");
    }

    public static void cadastrarProdutos(Map<String, Produto> estoque, String codigo, String nome, int quantidade){
        Produto prodAux = new Produto(codigo, nome, quantidade);
        estoque.put(prodAux.getCodigo(), new Produto(nome, quantidade));
    }

    public static void exibirProdutos(Map<String, Produto> estoque){
        for( Map.Entry<String, Produto> produto : estoque.entrySet()){
            String chave = produto.getKey();
            Produto valor = produto.getValue();
            System.out.printf("Chave: %s - Prod: %s\n", chave, valor.getNomeQuantidade());
        }
    }
    public static void buscarPorCodigo(Map<String, Produto> estoque, String codigoBuscado){
        if(estoque.containsKey(codigoBuscado)){
            System.out.println("Produto encontrado!");
        }else{
            System.out.println("Produto não existente!");
        }
    }
}
