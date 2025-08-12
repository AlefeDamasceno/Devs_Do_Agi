package br.com.devsdoagi.Semana2.s2ex17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float valor = 1000;
        int meses = 6, i;
        float taxa = 0.02F;

        float[] result1 = calcularJurosCompostos(valor, taxa, meses);
        for(i=0; i<meses; i++){
            System.out.printf("Mês %d - R$ %.2f\n",i+1, result1[i]);
        }
    }

    public static float[] calcularJurosCompostos(float valor, float taxa, int meses){
        int i;
        float[] montante = new float[6];
        float juros_mes = 1;

        for(i=0; i < meses; i++){
            juros_mes = (float) Math.pow((1+taxa), i+1);
            montante[i] = valor * juros_mes;

        }
        return montante;
    }
}
