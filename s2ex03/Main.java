package br.com.devsdoagi.s2ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        numero = scan.nextInt();

        String resultado = (numero % 2 == 0) ?"Numero PAR!":"Numero Impar";
        System.out.println(resultado);
    }
}
