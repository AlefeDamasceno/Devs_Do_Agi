package br.com.devsdoagi.s2ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        if(numero>0){
            System.out.println("Numero Positivo!");
        }else if (numero < 0){
            System.out.println("Numero Negativo!");
        }else{
            System.out.println("Numero é ZERO!");
        }
    }
}
