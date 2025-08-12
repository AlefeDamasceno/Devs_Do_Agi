package br.com.devsdoagi.Semana3.s3ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] produtos = new float[2][3];
        int i,j;

        Scanner sc = new Scanner(System.in);

        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                System.out.printf("loja %d prod. %d: ", i,j);
                produtos[i][j] = sc.nextFloat();
            }
        }
        float[] result = encontrarMenorPrecoPorProduto(produtos);
        for(i=0; i<2; i++){
            System.out.println(result[i]);
        }
    }
    public static float[] encontrarMenorPrecoPorProduto(float[][] produtos){
        float menor = produtos[0][0];
        float menor2 = produtos[0][0];
        float[] menores = new float[2];
        int i, j;

        for(i=0; i<2; i++){
            if(produtos[0][i] <= menor){
                menor = produtos[0][i];
            }
        }
        for (j=0; j<2; j++){
            if(produtos[1][j] <= menor2){
                menor2 = produtos[1][j];
            }
        }
        menores[0] = menor;
        menores[1] = menor2;
        return menores;
    }
}
