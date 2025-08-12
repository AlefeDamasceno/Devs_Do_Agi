package br.com.devsdoagi.Semana2.s2ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em reais:");
        valor = sc.nextDouble();

        double resultado = converterMoeda(valor);
        System.out.printf("%.2f em dolares, são: %.2f !", valor, resultado);
    }
    public static double converterMoeda(double valor){
        return (valor/5.42);
    }
}
