package br.com.devsdoagi.Semana2.s2ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tam_array,i, n;
        float[] produtos;
        float valores;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores deseja add? ");
        tam_array = sc.nextInt();
         produtos = new float[tam_array];

        System.out.println("Digite o intervalo:");
        n = sc.nextInt();

        for(i=0; i<tam_array; i++){
            System.out.printf("Valor prod %d: ", i+1);
            valores = sc.nextFloat();
            produtos[i] = valores;
        }

        calcularMediaMovel(produtos, n);
    }
    public static void calcularMediaMovel(float[] produtos, int n){
        float media_atual;
        int i,k;

        for(i=0; i <= produtos.length - n; i++){ //10 20 30 40 50 60 n = 3
            media_atual = 0;
            for (k = i; k < i + n; k++){ // 0 1 2
                media_atual += produtos[k];
            }
            media_atual = media_atual/n;
            System.out.printf("%.2f -> ", media_atual);
        }

    }
}
