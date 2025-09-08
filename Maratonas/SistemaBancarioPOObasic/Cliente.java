package hackaton.SistemaBancarioPOObasic;

public class Cliente {
    private String nome;
    private String cpf;

    //Construtores
    public Cliente(){
        this.nome = null;
        this.cpf = null;
    }
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
