package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc2;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

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

    public double getLimiteCredito(){
        return this.limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito){
        if (limiteCredito >= 1000 && limiteCredito <= 100000){
            this.limiteCredito = limiteCredito;
        }
    }

    public void exibirCliente(){
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("CPF: %s\n", getCpf());
        System.out.printf("Limite Crédito: %.2f\n", getLimiteCredito());
    }
}
