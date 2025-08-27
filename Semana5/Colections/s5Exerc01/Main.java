package br.com.devsdoagi.Semana5.Colections.s5Exerc01;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet <Integer> contas = new HashSet<>();

        adicionarContas(contas, 1024);
        adicionarContas(contas, 2024);
        adicionarContas(contas, 1922);
        adicionarContas(contas, 1922);
        boolean conta_existe = existeConta(contas, 1922);
        System.out.printf("A conta existe? %s\n", conta_existe);
        exibirContas(contas);
    }
    public static void adicionarContas(Set <Integer> contas, int numeroConta){
        if (!contas.contains(numeroConta)){
            contas.add(numeroConta);
        }
    }
    public static boolean existeConta(Set <Integer> contas, int numeroConta){
        if (contas.contains(numeroConta)){
            return true;
        }
        return false;
    }
    public static void exibirContas(Set <Integer> contas){
        int i = 1;
        for(Integer conta: contas){
            System.out.printf("Conta %d: %d\n",i, conta);
            i++;
        }
    }
}
