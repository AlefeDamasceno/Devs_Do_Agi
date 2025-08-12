package br.com.devsdoagi.Semana3.s3ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;
        float[][] dividas = new float[3][4];

        Scanner sc = new Scanner(System.in);

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.printf("Cliente %d divida %d: ", i+1,j+1);
                dividas[i][j] = sc.nextFloat();
            }
        }
        float result = encontrarMaiorValor(dividas);
        System.out.printf("Maior valor: %.2f", result);
    }
    public static float encontrarMaiorValor(float[][] valores){
        float maior = valores[0][0];
        int i, j;

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                if(valores[i][j] > maior){
                    maior = valores[i][j];
                }
            }
        }
        return maior;
    }
}
