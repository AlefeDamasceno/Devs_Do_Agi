package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc05;

public class CambioEuro extends Cambio{
    public CambioEuro(){
        super();
    }
    public CambioEuro(double valorEmReais, double taxaCambio){
        super(valorEmReais, taxaCambio);
    }

    @Override
    public double converter(){
        double valorEuro = 6.0;
        return (getValorEmReais() - getTaxaCambio()) / valorEuro;
    }
}
