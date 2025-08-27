package br.com.devsdoagi.Semana5.Colections.s5Exerc02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> investidores = new HashSet<>();

        adicionarProduto(investidores, "Mouse");
        adicionarProduto(investidores, "Teclado Gamer");
        exibirProdutos(investidores);
    }
    public static void adicionarProduto (Set<String> investidores, String nomeProduto){
        if (! investidores.contains(nomeProduto)){
            investidores.add(nomeProduto);
        }
    }
    public static void exibirProdutos(Set <String> investidores){
        int i =1;
        for(String produtos : investidores){
            System.out.printf("Produto %d: %s\n", i, produtos);
            i++;
        }
    }
}
