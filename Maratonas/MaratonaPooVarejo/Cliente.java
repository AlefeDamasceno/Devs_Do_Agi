package br.com.devsdoagi.Maratonas.MaratonaPooVarejo;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(){
        this.nome = null;
        this.email = null;
    }
    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
