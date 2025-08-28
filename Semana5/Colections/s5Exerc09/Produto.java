package br.com.devsdoagi.Semana5.Colections.s5exerc05;

public class Produto {
    protected String codigo;
    protected String nome;
    protected int quantidade;

    public Produto(String codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String codigo){
        this.codigo = codigo;
    }

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeQuantidade(){
        return nome +" - "+ quantidade;
    }
}
