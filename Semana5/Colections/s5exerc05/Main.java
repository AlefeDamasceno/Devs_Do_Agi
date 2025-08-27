package br.com.devsdoagi.Semana5.Colections.s5exerc05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> transacoes = new ArrayList<>();
        registrarTransacao(transacoes, "001-27/087");
        registrarTransacao(transacoes, "002-27/087");
        registrarTransacao(transacoes, "003-27/087");
        registrarTransacao(transacoes, "004-27/087");

        boolean transacaoExiste = buscarTransacao(transacoes, "003-27/087" );
        System.out.printf("A transação %s já existe? %s\n", "003-27/087", transacaoExiste);

        exibirHistorico(transacoes);

    }
    public static void registrarTransacao(List<String> transacoes, String transacao){
        transacoes.add(transacao);
    }

    public static boolean buscarTransacao (List<String> transacoes, String transacao){
        return transacoes.contains(transacao);
    }

    public static void exibirHistorico(List<String> transacoes){
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.printf("Transação %d: %s\n", i+1, transacoes.get(i));
        }
    }
}
