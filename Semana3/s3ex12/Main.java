package br.com.devsdoagi.Semana3.s3ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;
        int c,p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos clientes? ");
        c = sc.nextInt();
        System.out.println("Quantas parcelas? ");
        p = sc.nextInt();

        float[][] clientes_parcelas = new float[c][p];
        for(i=0; i<clientes_parcelas.length; i++){
            for(j=0; j<clientes_parcelas[0].length; j++){
                System.out.printf("Cliente %d parcela %d: ", i+1, j+1);
                clientes_parcelas[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Qual total de cliente deseja ver? ");
        int cliente_desejado = sc.nextInt();

        float result = total_pago_cliente(clientes_parcelas, cliente_desejado);
        System.out.printf("Total do cliente %d: R$ %.2f\n", cliente_desejado, result);

        System.out.println("Pago por cada cliente:");
        float[] result1 = total_pago_todos(clientes_parcelas);
        for (i=0; i<result1.length; i++){
            System.out.printf("%.2f - ", result1[i]);
        }
        int result2 = clienteMaisAdiantado(result1);
        System.out.printf("Cliente mais adiantado: %d", result2);
    }
    public static float total_pago_cliente(float[][] clientes_parcelas, int cliente){
        int i;
        float total = 0;

        for(i=0; i<clientes_parcelas[0].length; i++){
            total += clientes_parcelas[cliente-1][i];
        }
        return total;
    }
    public static float[] total_pago_todos (float[][] clientes_parcelas){
        int i,j;
        float total;
        float[] pago_por_todos = new float[clientes_parcelas.length];

        for(i=0; i<clientes_parcelas.length; i++){
            total = 0;
            for(j=0; j<clientes_parcelas[0].length; j++){
                total += clientes_parcelas[i][j];
            }
            pago_por_todos[i] = total;
        }
        return pago_por_todos;
    }
    public static int clienteMaisAdiantado (float[] total_pago_cada) {
        int i, posicao = 0;
        float maior = total_pago_cada[0];

        for (i=0; i<total_pago_cada.length; i++){
            if (total_pago_cada[i] > maior){
                maior = total_pago_cada[i];
                posicao = i;
            }
        }
        return posicao+1;
    }
}
