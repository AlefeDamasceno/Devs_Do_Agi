package br.com.devsdoagi.Semana4.Interfaces.PooExerc01;

public class ProdutoPromocional implements IDescontavel{

    @Override
    public double calcularPrecoFinal(double precoBase){
        return precoBase * 0.8;
    }
}
