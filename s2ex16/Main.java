package br.com.devsdoagi.s2ex16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        float valor_compravenda;
        float[] compra = new float[5];
        float[] venda = new float[5];

        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.printf("Compra ativo %d: ",i+1);
            valor_compravenda = sc.nextFloat();
            compra[i] = valor_compravenda;
            System.out.printf("venda ativo %d: ",i+1);
            valor_compravenda = sc.nextFloat();
            venda[i] = valor_compravenda;
            System.out.println();
        }
        float[] result = lucroPorAtivo(compra, venda);
        for (i=0;i<5;i++){
            System.out.println(result[i]);
        }
        float result1 = lucroTotal(result);
        System.out.printf("Lucro Total: %.2f\n", result1);

        float result2 = calcularImposto(result1);
        System.out.printf("Valor com Imposto: %.2f", result2);
    }
    public static float[] lucroPorAtivo(float[] compra, float[] venda){
        int i;
        float[] lucro_ativos = new float[5];

        for(i=0; i<5;i++){
            lucro_ativos[i] = venda[i] - compra[i];
        }
        return lucro_ativos;
    }
    public static float lucroTotal(float[] lucro_ativo){
        int i;
        float lucro_total=0;

        for(i=0; i<lucro_ativo.length; i++){
            lucro_total += lucro_ativo[i];
        }
        return lucro_total;
    }
    public static float calcularImposto(float lucro_total){
        if(lucro_total > 20000){
            return (float) (lucro_total * 0.85);
        }
        return lucro_total;
    }
}
