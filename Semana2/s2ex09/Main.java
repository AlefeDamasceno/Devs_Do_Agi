package br.com.devsdoagi.Semana2.s2ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dia1, dia2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dia 1:");
        dia1 = sc.nextDouble();
        System.out.println("Dia 2:");
        dia2 = sc.nextDouble();

        calcularCrescimento(dia1, dia2);
    }
    public static void calcularCrescimento(double dia1, double dia2){
        double diferenca = 0;
        if(dia2 > dia1){
            //100 105 = 5%
            diferenca = (dia2 / dia1 - 1) * 100;
        }if(dia1 > dia2){
            //105 100 = -5%
            diferenca = -(dia1/dia2-1)*100;
        }if (dia1 == dia2){
            System.out.println("Não há alteração.");
        }

        if (diferenca > 0){
            System.out.printf("Crescimento: %.2f porcento.", diferenca);
        }else{
            System.out.printf("Decaimento: %.2f porcento.", diferenca);
        }
    }
}
