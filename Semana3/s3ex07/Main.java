package br.com.devsdoagi.Semana3.s3ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] taxas = new float[2][2];
        int i,j;

        Scanner sc = new Scanner(System.in);

        for(i=0; i<2; i++){
            for( j=0; j<2; j++){
                System.out.printf("taxa juros n %d: ",i+1);
                taxas[i][j] = sc.nextFloat();
            }
        }
        float result = encontrarMenorTaxa(taxas);
        System.out.printf("Menor taxa: %.2f\n", result);

        float[] result1 = calcularMediaPorMes(taxas);
        for(i=0; i<2; i++){
            System.out.printf("%.2f - \n", result1[i]);
        }

    }
    public static float encontrarMenorTaxa (float[][] taxas){
        int i,j;
        float menor = taxas[0][0];

        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                if(taxas[i][j] < menor){
                    menor = taxas[i][j];
                }
            }
        }
        return menor;
    }
    public static float[] calcularMediaPorMes ( float[][] taxas){
        int i,j;
        float[] media_mes = new float[2];
        float soma;

        for(i=0; i<2; i++){
            soma = 0;
            for (j=0; j<2; j++){
                soma += taxas[i][j];
            }
            media_mes[i] = soma/2;
        }
        return media_mes;
    }
}
