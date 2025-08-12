package br.com.devsdoagi.Semana2.s2ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ativo1, ativo2;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Valor Ativo 1: ");
        ativo1 = sc.nextDouble();
        System.out.printf("Valor Ativo 2: ");
        ativo2 = sc.nextDouble();

        String resultado = compararAtivos(ativo1, ativo2);
        System.out.printf(resultado);
    }
    public static String compararAtivos(double ativo1, double ativo2){
        if (ativo1 > ativo2){
            return "Ativo 1";
        }else if(ativo2 > ativo1){
            return "Ativo 2";
        }else {
            return "Ambos iguais";
        }
    }
}
