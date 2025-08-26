package br.com.devsdoagi.Semana5.exceptions.s5Exerc04;

public class Main {
    public static void main(String[] args) {
        double valor = 5000;
        double taxaMensal = 0.03;
        int meses = 24;

        double valorParcela = calcularParcela(valor, taxaMensal, meses);
        if(valorParcela != 0){
            System.out.println(valorParcela);
        }
    }

    public static double calcularParcela(double valor, double taxaMensal, int meses){
        try{
            if (taxaMensal < 0){
                throw new IllegalArgumentException("Taxa de juros negativa!");
            }
            if (valor == 0){
                throw new ArithmeticException("Valor do empréstimo igual a 0!");
            }
            return (valor * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -meses));

        }catch(IllegalArgumentException | ArithmeticException e){
            System.out.println(e.getMessage());

        }
        return 0;
    }
}
