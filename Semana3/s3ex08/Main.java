package br.com.devsdoagi.Semana3.s3ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] produtos = new float[3][2];
        int i, j;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("vendedor %d mes %d: ", i + 1, j + 1);
                produtos[i][j] = sc.nextFloat();
            }
            System.out.println("");
        }
        float[] result = somarVendasPorMes(produtos);
        for(i=0; i<3; i++){
            System.out.printf("%.2f - ", result[i]);
        }
        System.out.println("FIM");
    }
    public static float[] somarVendasPorMes(float[][] produtos){
        int i,j;
        float[] soma_colunas = new float[3];

        for (i = 0; i < 3; i++) {
            for (j=0; j<2; j++){
                soma_colunas[i] += produtos[i][j];
            }
        }
        return soma_colunas;
    }
}