package br.com.devsdoagi.Maratonas.MiniHackaton1;

//Criando classe Pai
public class Funcionario {
    private String nome;
    private double salario;

    //Criando construtor vazio
    public Funcionario(){
        this.nome = null;
        this.salario = 0.0;
    }
    //Criando construtor com parametros
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //getter nome
    public String getNome(){
        return nome;
    }
    //setter nome
    public void setNome(String nome){
        this.nome = nome;
    }
    //getter salario
    public double getSalario(){
        return salario;
    }
    //setter salario
    public void setSalario(double salario){
        this.salario = salario;
    }
}
