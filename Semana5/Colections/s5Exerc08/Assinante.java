package br.com.devsdoagi.Semana5.Colections.s5exerc05;
import java.util.Objects;


public class Assinante {
    protected String id;
    protected String nome;
    protected String email;

    public Assinante(String id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Assinante assinante)) return false;
        return Objects.equals(email, assinante.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
