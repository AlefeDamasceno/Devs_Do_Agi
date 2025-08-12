package br.com.devsdoagi.Semana2.s2ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float valor, media, aprox;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite A média: ");
        media = sc.nextFloat();
        System.out.println("Digite o valor a comparar: ");
        valor = sc.nextFloat();
        aprox = (valor/media)*100;

        System.out.printf("O valor %.2f se aproxima %.2f da média %.2f", valor, aprox,media);
    }
}
