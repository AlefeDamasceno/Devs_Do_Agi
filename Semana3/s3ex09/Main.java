package br.com.devsdoagi.Semana3.s3ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] saldos = new float[2][3];
        int i,j;

        Scanner sc = new Scanner(System.in);

        for(i=0; i<saldos.length; i++){
            for(j=0; j<saldos[0].length; j++){
                System.out.println("Saldo: ");
                saldos[i][j] = sc.nextFloat();
            }
            System.out.println("");
        }
        float[] result = calcularSaldoTotal(saldos);
        System.out.println("Saldo Total: ");
        for (i=0; i<result.length; i++){
            System.out.printf("Conta %d - %.2f\n",i+1, result[i]);
        }
        float[] result1 = encontrarMaximoPorConta(saldos);
        for(float x: result1){
            System.out.printf("%.2f - ", x);
        }
    }
    public static float[] calcularSaldoTotal (float[][] saldos){
        float[] saldo_por_conta = new float[2];
        int i,j;

        for(i=0; i<saldos.length; i++){
            for(j=0; j<saldos[0].length; j++){
                saldo_por_conta[i] += saldos[i][j];
            }
        }
        return saldo_por_conta;
    }
    public static float[] encontrarMaximoPorConta (float[][] saldos){
        int i,j;
        float[] maximo_por_conta = new float[2];
        float maior = saldos[0][0];

        for(i = 0; i< saldos.length; i++){
            for(j=0; j<saldos[0].length; j++){
                if (saldos[i][j] > maior){
                    maior = saldos[i][j];
                }
                maximo_por_conta[i] = maior;
            }
        }
        return maximo_por_conta;
    }
}
