package br.com.devsdoagi.Semana3.s3ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;
        int clientes, dias;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos clientes? ");
        clientes = sc.nextInt();
        System.out.println("Por quantos dias? ");
        dias = sc.nextInt();

        float[][] saldos_diarios = new float[clientes][dias];

        for(i=0; i<saldos_diarios.length; i++){
            for(j=0; j<saldos_diarios[0].length; j++){
                System.out.printf("Cliente %d saldo %d: ", i+1, j+1);
                saldos_diarios[i][j] = sc.nextFloat();
            }
            System.out.println("");
        }
        System.out.println("Cliente que deseja ver o saldo total: ");
        int cliente_desejado = sc.nextInt();
        float result = saldo_final_indiv(saldos_diarios, cliente_desejado);
        System.out.printf("Total do cliente %d: R$ %.2f", cliente_desejado, result);

        float result2 = saldo_final_total(saldos_diarios);
        System.out.printf("\nSaldo Final Total: R$ %.2f", result2);

        imprimirExtratoClientes(saldos_diarios);
    }
    public static float saldo_final_indiv(float[][] saldos_diarios, int cliente){
        int i;
        float total=0;

        for(i=0; i < saldos_diarios[0].length; i++){
            total += saldos_diarios[cliente-1][i];
        }
        return total;
    }
    public static float saldo_final_total(float[][] saldos_diarios){
        int i, j;
        float total =0;

        for(i=0; i<saldos_diarios.length; i++){
            for(j=0; j<saldos_diarios[0].length; j++){
                total += saldos_diarios[i][j];
            }
        }
        return total;
    }
    public static void imprimirExtratoClientes (float[][] saldos_diarios){
        int i,j;


        for(i=0; i<saldos_diarios.length; i++){
            System.out.printf("\n%-5s - %-5d - %-1s", "cliente", i, "Saldo");
            for(j=0; j<saldos_diarios[0].length; j++){
                System.out.printf("%3d - %5s",j+1, saldos_diarios[i][j]);
            }
        }
    }
}
