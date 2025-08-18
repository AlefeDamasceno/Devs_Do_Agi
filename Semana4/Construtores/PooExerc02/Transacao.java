package br.com.devsdoagi.Semana4.Construtores.PooExerc02;

public class Transacao {
    private String id;
    private String tipo;
    private double valor;

    public Transacao(String id, String tipo){
        this.id = id;
        this.tipo = tipo;
        this.valor = 0;
    }
    public Transacao(String id, String tipo, double valor){
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }
}
