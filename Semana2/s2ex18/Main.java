package br.com.devsdoagi.Semana2.s2ex18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float valor;
        float[] valores_acao = new float[5];

        Scanner sc = new Scanner(System.in);

        for(i=0;i<5;i++){
            System.out.printf("Valor dia %d: ", i+1);
            valor = sc.nextFloat();
            valores_acao[i] = valor;
        }
        float result = calcularCrescimentoPercentual(valores_acao);
        System.out.printf("Crescimento percentual: %.2f", result);
    }
    public static float calcularCrescimentoPercentual(float[] valores_acao){
        float percentual_final;

        percentual_final = ((valores_acao[valores_acao.length-1] - valores_acao[0])/ valores_acao[0]) *100;
        return percentual_final;
    }
}
