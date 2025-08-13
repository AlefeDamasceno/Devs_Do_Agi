package br.com.devsdoagi.Semana3.s3ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f,m,i,j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos fundos? ");
        f = sc.nextInt();
        System.out.println("Por quantos meses? ");
        m = sc.nextInt();

        float[][] fundos = new float[f][m];

        for(i=0; i<fundos.length; i++){
            for(j=0; j< fundos[0].length; j++){
                System.out.printf("Fundo %d mes %d: ",i+1,j+1);
                fundos[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Fundo que deseja ver rentabilidade: ");
        int fundo_desejado = sc.nextInt();
        float rentabilidade = rentabilidade(fundos, fundo_desejado);
        System.out.printf("Rentabilidade: %.2f", rentabilidade);

        float fundo_mais_rentavel = fundo_mais_rentavel(fundos, m);
        System.out.printf("\nFundo mais rentavel: %.0f", fundo_mais_rentavel);
    }
    public static float rentabilidade (float[][] fundos, int desejado) {
        float rentabilidade = (fundos[desejado][1] / fundos[desejado][0] - 1) * 100;
        return rentabilidade;
    }
    public static float fundo_mais_rentavel (float[][] fundos, int m){
        float[] rentabilidade_fundos = new float[m];
        float soma,rentabilidade;
        int i,j, indice=0;

        for( i=0; i<fundos.length; i++){
            soma = 0;
            for(j=1; j<fundos[0].length; j++){
                rentabilidade = (fundos[i][j] / fundos[i][j-1] - 1) * 100;
                rentabilidade_fundos[i] = rentabilidade;
            }
        }
        float maior_rent = rentabilidade_fundos[0];
        for(i=0; i<rentabilidade_fundos.length; i++){
            if(rentabilidade_fundos[i] > maior_rent){
                maior_rent = rentabilidade_fundos[i];
                indice = i;
            }
        }
        return indice;
    }
}
