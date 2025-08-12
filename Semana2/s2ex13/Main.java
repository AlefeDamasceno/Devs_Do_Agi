package br.com.devsdoagi.Semana2.s2ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float[] valores_acao = new float[10];
        float valores;

        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++){
            System.out.printf("Valor dia %d: ", i+1);
            valores = sc.nextFloat();
            valores_acao[i] = valores;
        }
        float result = maiorPreco(valores_acao);
        float result1 = menorPreco(valores_acao);
        System.out.printf("Maior Preço: %.2f\nMenor Preço: %.2f", result, result1);
    }

    public static float maiorPreco(float[] valores_acao){
        int i;
        float maior = 0;

        for(i=0; i<valores_acao.length; i++){
            if(valores_acao[i] > maior){
                maior = valores_acao[i];
            }
        }
        return maior;
    }

    public static float menorPreco(float[] valores_acao){
        int i;
        float menor = 999;

        for(i=0; i<valores_acao.length; i++){
            if(valores_acao[i] < menor){
                menor = valores_acao[i];
            }
        }
        return menor;
    }
}
