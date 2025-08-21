package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc02;

public class CartaoCredito extends Cartao{
    public CartaoCredito(){
        super();
    }
    public CartaoCredito(String numero, double limite){
        super(numero, limite);
    }

    public void processarCompra(double valor){
        setLimite(getLimite() - valor);
    }
}
