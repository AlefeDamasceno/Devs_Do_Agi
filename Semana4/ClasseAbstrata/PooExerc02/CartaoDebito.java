package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc02;

public class CartaoDebito extends Cartao{
    private double saldoConta;

    public CartaoDebito(){
        super();
        this.saldoConta = 0;
    }
    public CartaoDebito(String numero, double limite){
        super(numero, limite);
    }

    @Override
    public void processarCompra(double valor){
        setLimite(getLimite() - valor);
    }
}
