package br.com.devsdoagi.Semana4.Polimorfismo.Overload.PooExerc01;

public class CalculadoraFinanceira {

    public double calcularRetorno(double capital, double taxa_mensal, int meses){
        return capital * taxa_mensal/100 * meses;
    }
    public double calcularRetorno(double capital, double taxa_mensal){
        return capital * taxa_mensal/100 * 12;
    }
    public double calcularRetorno(double capital){
        return capital * 0.015 * 12;
    }

}
