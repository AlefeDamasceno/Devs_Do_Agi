package br.com.devsdoagi.Semana5.Colections.s5exerc05;

import java.util.Objects;

public class Contato {
    protected String nome;
    protected String telefone;
    protected String email;

    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" - "+"Telefone: "+telefone+" - "+"Email: "+email;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
