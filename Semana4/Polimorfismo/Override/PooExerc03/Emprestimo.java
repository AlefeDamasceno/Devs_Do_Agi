package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc03;

public class Emprestimo {
    protected double valorEmprestado;

    public Emprestimo(double valorEmprestado){
        this.valorEmprestado = valorEmprestado;
    }

    public double calcularParcela(int meses){
        return valorEmprestado / meses;
    }
}
