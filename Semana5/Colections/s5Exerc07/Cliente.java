package br.com.devsdoagi.Semana5.Colections.s5exerc05;

public class Cliente {
    protected String id;
    protected String nome;
    protected String cpf;

    public Cliente(String id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
