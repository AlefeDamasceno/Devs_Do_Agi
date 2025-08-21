package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc05;

public class CambioDolar extends Cambio{

    public CambioDolar(){
        super();
    }
    public CambioDolar(double valorEmReais, double taxaCambio){
        super(valorEmReais, taxaCambio);
    }

    @Override
    public double converter() {
        double valorDolar = 5.0;
        return (getValorEmReais() - getTaxaCambio()) / valorDolar;
    }
}
