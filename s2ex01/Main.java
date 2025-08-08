package br.com.devsdoagi.s2ex01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int idade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        String resultado = (idade >= 18) ? "Maior que 18 anos!":"Menor que 18 anos!";
        System.out.println(resultado);
    }
}