package br.com.devsdoagi.Semana4.Heranca.PooExerc02;

public class Transacao {
    protected String id;
    protected String data;
    protected double valor;

    public Transacao(String id, String data, double valor){
        this.id = id;
        this.data = data;
        this.valor = valor;
    }
}
