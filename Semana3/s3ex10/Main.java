package br.com.devsdoagi.Semana3.s3ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] pagamentos = new float[3][3];
        int i, j;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < pagamentos.length; i++) {
            for (j = 0; j < pagamentos[0].length; j++) {
                System.out.printf("Saldo cliente %d mes %d: ", i + 1, j + 1);
                pagamentos[i][j] = sc.nextFloat();
            }
        }
        float[] result = calcularMediaTotal(pagamentos);
        for (i = 0; i < result.length; i++) {
            System.out.printf("Media cliente %d: %.2f\n", i + 1, result[i]);
        }
        float result1 = encontrarClienteMaiorPagamento(pagamentos);
        System.out.printf("Maior pagador: %.2f", result1);
    }

    public static float[] calcularMediaTotal(float[][] pagamentos) {
        float soma;
        float[] media_clientes = new float[3];
        int i, j;

        for (i = 0; i < 3; i++) {
            soma = 0;
            for (j = 0; j < 3; j++) {
                soma += pagamentos[i][j];
            }
            media_clientes[i] = soma / media_clientes.length;
        }
        return media_clientes;
    }

    public static float encontrarClienteMaiorPagamento(float[][] pagamentos) {
        int i, j;
        float maior=0;

        for (i = 0; i < pagamentos.length; i++) {
            maior = 0;
            for (j = 0; j < pagamentos[0].length; j++) {
                if (pagamentos[i][j] > maior) {
                    maior = pagamentos[i][j];
                }
            }
        }
        return maior;
    }
}
