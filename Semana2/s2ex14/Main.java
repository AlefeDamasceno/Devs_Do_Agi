package br.com.devsdoagi.Semana2.s2ex14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float[] valores_acao = new float[5];
        float valores;

        Scanner sc = new Scanner(System.in);
        for(i=0; i<5; i++){
            System.out.printf("Valor dia %d: ", i+1);
            valores = sc.nextFloat();
            valores_acao[i] = valores;
        }
        float[] result = variacaoDiaria(valores_acao);
        System.out.println("Variação Diária das ações:");

        for(i=0; i<4; i++){
            System.out.printf("%.2f - ", result[i]);
        }
    }
    public static float[] variacaoDiaria(float[] valores_acao){
        int i;
        float[] variacao_percentual = new float[5];

        for(i=0; i < valores_acao.length-1; i++){ // 0 1 2 3 4      10 20 30 40 50
            variacao_percentual[i] = (valores_acao[i+1] / valores_acao[i] - 1)*100;
        }
        return variacao_percentual;
    }
}
