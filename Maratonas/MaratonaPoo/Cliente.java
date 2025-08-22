package br.com.devsdoagi.Maratonas.MaratonaPoo;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(){
        this.nome = null;
        this.cpf = null;
    }
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
