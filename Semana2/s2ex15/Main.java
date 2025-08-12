package br.com.devsdoagi.Semana2.s2ex15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float valores;
        float[] carteira = new float[5];

        Scanner sc = new Scanner(System.in);
        for(i=0; i<5; i++){
            System.out.printf("Valor investimento %d: ",i+1);
            valores = sc.nextFloat();
            carteira[i] = valores;
        }

        float result = totalInvestido(carteira);
        System.out.printf("Total Investido: %.2f\n", result);

        float[] result1 = percentualPorAcao(carteira, result);
        for (i=0; i<carteira.length; i++){
            System.out.printf("%d - %.2f\n", i+1, result1[i]);
        }


    }
    public static float totalInvestido(float[] carteira){
        float total = 0;
        int i;

        for(i=0; i<carteira.length; i++){
            total += carteira[i];
        }
        return total;
    }
    public static float[] percentualPorAcao( float[] carteira, float result){
        float[] percentual = new float[5];
        int i;

        for(i=0; i<carteira.length; i++){
            percentual[i] = (carteira[i]/result)*100;
        }
        return percentual;
    }
}
