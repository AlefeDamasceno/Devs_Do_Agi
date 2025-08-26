package br.com.devsdoagi.Semana5.exceptions.s5Exerc05;

public class Main {
    public static void main(String[] args) {
        String[][] matriz = {
                {"0.05", "0.08", "0.04"},
                {"0.07", "0.06", "0.09"},
        };

        try{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    double valor = Double.parseDouble(matriz[i][j]);
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Valor não numérico em matriz!");

        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Portfólio incompleto!");
        }
    }
}
