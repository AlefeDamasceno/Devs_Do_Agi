package br.com.devsdoagi.Semana5.exceptions.s5Exerc03;

public class Main {
    public static void main(String[] args) {
        double[][] planilhaRisco = {
                { 0.2, 0.5, 0.1, 0.4, 0.3},
                {0.7, 0.9, 0.1, 0.6, 0.8},
                {0.2, 0.5, 0.1, 0.4, 0.3}};

        try{
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5 ; j++) {
                    if( planilhaRisco[i][j] < 0 || planilhaRisco[i][j] > 1){
                        throw new MinhaExcecao("Valor inválido encontrado em planilhaRisco!");
                    }
                }
            }
        }catch (MinhaExcecao e){
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Matriz Incompleta!");
        }
    }
}
