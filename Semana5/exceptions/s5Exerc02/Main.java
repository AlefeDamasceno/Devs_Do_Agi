package br.com.devsdoagi.Semana5.exceptions.s5Exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        double[] precos = {100.0, 102.0, 103.0, 105.0, 101.0};

        try {
            if (precos.length < 3) {
                throw new IllegalArgumentException("É necessário ter pelo menos 3 preços");
            }
            for (int i = 0; i < precos.length - 2; i++) {
                double mediaDiaAtual = (precos[i] + precos[i + 1] + precos[i + 2]) / 3;
                System.out.printf("Media dia %d: %.2f\n", i + 1, mediaDiaAtual);
            }
        }catch (IllegalArgumentException e){
            System.out.printf("erro: %s", e.getMessage());
        }
    }
}
