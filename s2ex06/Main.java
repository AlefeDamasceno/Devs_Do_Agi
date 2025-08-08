package br.com.devsdoagi.s2ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota_final;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota final: ");
        nota_final = sc.nextFloat();

        if(nota_final>=6){
            System.out.println("APROVADO!");
        }else if(nota_final >= 4){
            System.out.println("EXAME!");
        }else{
            System.out.println("REPROVADO!");
        }
    }
}
