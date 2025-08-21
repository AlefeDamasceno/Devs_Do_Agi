package br.com.devsdoagi.Semana4.Interfaces.PooExerc01;

public class ProdutoComum implements IDescontavel{

    @Override
    public double calcularPrecoFinal(double precoBase){
        return precoBase * 0.95;
    }
}
