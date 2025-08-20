package br.com.devsdoagi.Semana4.Polimorfismo.Overload.PooExerc01;

public class MainCalculadoraFInanceira {
    public static void main(String[] args) {
        CalculadoraFinanceira invest1 = new CalculadoraFinanceira();
        double valor1 = invest1.calcularRetorno(1000);
        double valor2 = invest1.calcularRetorno(1000, 1);
        double valor3 = invest1.calcularRetorno(1000, 1, 10);

        System.out.printf("%.2f - %.2f - %.2f", valor1, valor2, valor3);
    }
}
