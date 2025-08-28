package br.com.devsdoagi.Semana5.Colections.s5exerc05;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Assinante> assinantes = new HashSet<>();
        cadastrarAssinantes(assinantes, "001", "Alefe Gomes", "alefe@gmail.com");
        cadastrarAssinantes(assinantes, "001", "Pedro Aurelio", "pedro@gmail.com");
        cadastrarAssinantes(assinantes, "002", "Arthur gomes", "alefe@gmail.com");
        exibirAssinantes(assinantes);
    }
    public static void cadastrarAssinantes(Set<Assinante> assinantes, String id, String nome, String email){
        assinantes.add(new Assinante(id, nome, email));
    }
    public static void exibirAssinantes(Set<Assinante> assinantes){
        for (Assinante assinante : assinantes){
            System.out.printf("Assinante: %s\n", assinante.getNome());
        }
    }
}
