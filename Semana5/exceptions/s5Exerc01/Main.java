package br.com.devsdoagi.Semana5.exceptions.s5Exerc01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] saldos = new double[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < saldos.length; i++) {
            System.out.printf("Saldo conta %d: ",i+1);
            saldos[i] = sc.nextDouble();
        }
        System.out.println("Digite o indice da conta: ");
        int indiceProcurado = sc.nextInt();

        try{
            System.out.printf("Conta indice %.2f encontrada!", saldos[indiceProcurado]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Conta não encontrada!");
        }
    }

}
