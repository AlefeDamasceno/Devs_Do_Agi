package br.com.devsdoagi.Semana2.s2ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float[] precos = new float[10];
        float valores;


        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++){
            System.out.printf("Preço dia %d: ", i+1);
            valores = sc.nextFloat();
            precos[i] = valores;
        }

        int result = primeiraTrincaAlta(precos);
        if(result == 0){
            System.out.println("Nao existe trinca alta.");
        }else{
            System.out.print("Primeira Trinca Alta: ");
            System.out.printf("%d - %d - %d", result, result+1, result+2);
        }
    }
    public static int primeiraTrincaAlta(float[] precos){
        int i;

        for (i=0; i<precos.length-2; i++){
            if((precos[i]<precos[i+1]) && (precos[i+1] < precos[i+2])){
                return i;
            }
        }
        return 0;
    }
}

