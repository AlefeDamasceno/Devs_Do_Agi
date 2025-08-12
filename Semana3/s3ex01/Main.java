package br.com.devsdoagi.Semana3.s3ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] receitas_despesas = new float[2][2];
        preencherMatriz(receitas_despesas);
        float result = calcularSomaTotal(receitas_despesas);

        System.out.printf("Total: %.2f", result);
    }
    public static void preencherMatriz(float[][] receitas_despesas){
        int i,j;
        Scanner sc = new Scanner(System.in);

        for(i=0; i < 2; i++){
            System.out.println("Receitas: ");
            receitas_despesas[i][0] = sc.nextFloat();
            System.out.println("Despesas:");
            receitas_despesas[i][1] = sc.nextFloat();
        }
    }
    public static float calcularSomaTotal (float[][] receitas_despesas){
        float total = 0;
        int i, j;

        for(i=0; i<2; i++){ // 0 a 2
            for(j=0; j<2; j++){ // 0 a 2
                total += receitas_despesas[i][j];
            }
        }
        return total;
    }
}
