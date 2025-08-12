package br.com.devsdoagi.Semana2.s2ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n;
        float valor;
        float[] precos_ativo = new float[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Intervalo n: ");
        n = sc.nextInt();

        for (i = 0; i < 7; i++) {
            System.out.printf("Valor dia %d: ", i + 1);
            valor = sc.nextFloat();
            precos_ativo[i] = valor;
        }

        float[] result = media_movel(precos_ativo, n);
        for (i=0; i<5; i++){
            System.out.printf("%.2f - ", result[i]);
        }
    }
    public static float[] media_movel(float[] precos_ativo, int n){
        int i,c;
        float total;
        float[] media_movel = new float[5];

        for(i=0; i <= precos_ativo.length-n; i++){ // 0 1 2 3 4
            total = 0;
            for (c = i; c < n+i; c++){
                total += precos_ativo[c];
            }
            total = total/n;
            media_movel[i] = total;
        }
        return media_movel;
    }
}