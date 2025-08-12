package br.com.devsdoagi.Semana3.s3ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;
        float[][] dividas = new float[3][2];

        Scanner sc = new Scanner(System.in);

        for(i=0; i<3; i++){
            for(j=0; j<2; j++){
                System.out.printf("Cliente %d divida %d: ", i+1,j+1);
                dividas[i][j] = sc.nextFloat();
            }
        }
        float result = calcularSaldoTotal(dividas);
        System.out.printf("\nTotal dos saldos: %.2f\n", result);
        float[] result1 = calcularMediaCliente(dividas);
        for (i=0; i<3; i++){
            System.out.printf("Media cliente %d: %.2f\n", i+1, result1[i]);
        }

    }
    public static float calcularSaldoTotal( float[][] dividas){
        int i,j;
        float total=0;

        for(i=0; i<3; i++){
            for(j=0; j<2; j++){
                total += dividas[i][j];
            }
        }
        return total;
    }
    public static float[] calcularMediaCliente( float[][] dividas){
        int i,j;
        float[] mediaCliente = new float[3];
        float total;

        for(i=0; i<3; i++){
            total = 0;
            for (j=0; j<2; j++){
                total += dividas[i][j];
            }
            total = total / dividas[i].length;
            mediaCliente[i] = total;
        }
        return mediaCliente;
    }
}
