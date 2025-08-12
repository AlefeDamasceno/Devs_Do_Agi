package br.com.devsdoagi.Semana2.s2ex20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float valor;
        float[] valores_acao = new float[10];

        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++){
            System.out.printf("valor dia %d: ", i+1);
            valor = sc.nextFloat();
            valores_acao[i] = valor;
        }

        int result = contarDiasAltas(valores_acao);
        System.out.printf("Quant. Dias Altas: %d", result);
        int result1 = contarDiasQueda(valores_acao);
        System.out.printf("\nQuant. Dias Queda: %d", result1);
    }
    public static int contarDiasAltas(float[] precos){
        int dias_altas = 0,i;
        for(i=0; i < precos.length-1; i++){
            if(precos[i] < precos[i+1]){
                dias_altas++;
            }
        }
        return dias_altas;
    }
    public static int contarDiasQueda(float[] precos){
        int dias_queda = 0, i;
        for(i=0; i<precos.length-1; i++){
            if(precos[i] > precos[i+1]){
                dias_queda++;
            }
        }
        return dias_queda;
    }
}

