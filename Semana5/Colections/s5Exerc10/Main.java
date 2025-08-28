package br.com.devsdoagi.Semana5.Colections.s5exerc05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();

        adicionarContato(contatos, "Alefe", "1023912", "200@gmail.com");
        adicionarContato(contatos, "Pedro", "1345213", "200@gmail.com");
        adicionarContato(contatos, "Vini", "3459345", "vini@gmail.com");
        adicionarContato(contatos, "Rafael", "45632622", "rafa@gmail.com");
        exibirContato(contatos);
    }

    public static void adicionarContato(Set<Contato> contatos, String nome, String telefone, String email){
        contatos.add(new Contato(nome, telefone, email));
    }
    public static void exibirContato(Set<Contato> contatos){
        List<Contato> conversao = contatos.stream().sorted(Comparator.comparing(Contato::getNome)).toList();
        for(Contato contato : conversao){
            System.out.println(contato);
        }

    }
}
