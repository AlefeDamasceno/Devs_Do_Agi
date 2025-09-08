package Semana6.s6Exerc06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("alefe");
        nomes.add("arthur");
        nomes.add("ana");

        List<String> nomesMaiusculo = nomes.stream()
                .map(String::toUpperCase).toList();
        for(String nome : nomesMaiusculo){
            System.out.println(nome);
        }
    }
}
