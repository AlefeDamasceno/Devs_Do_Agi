package br.com.devsdoagi.s2ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float imc,altura,peso;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso (em kg):");
        peso = sc.nextFloat();
        System.out.println("Digite sua altura (em m):");
        altura = sc.nextFloat();

        imc = peso/(altura*altura);
        System.out.printf("IMC: %.2f\n", imc);

        if(imc < 18.5){
            System.out.println("Abaixo do Peso");
        }else if((imc > 18.5) && (imc < 24.9)){
            System.out.println("Peso Normal!");
        }else if(imc > 24.9){
            System.out.println("Sobrepeso!");
        }
    }
}
