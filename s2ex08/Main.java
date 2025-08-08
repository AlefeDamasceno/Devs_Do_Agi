package br.com.devsdoagi.s2ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double capital_inicial, taxa_juros;
        int anos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a capital inicial: ");
        capital_inicial = sc.nextDouble();

        System.out.println("Digite a taxa de juros (anual): ");
        taxa_juros = sc.nextDouble();
        taxa_juros = taxa_juros/100;

        System.out.println("tempo (em anos):");
        anos = sc.nextInt();

        double Montante_final = calcularJurosSimples(capital_inicial, taxa_juros, anos);
        System.out.printf("Montante Final: %.2f", Montante_final);
    }
    public static double calcularJurosSimples(double capital_inicial, double taxa_juros, int anos){
        return capital_inicial*taxa_juros*anos;
    }
}
