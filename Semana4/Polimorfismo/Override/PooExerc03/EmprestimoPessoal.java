package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc03;

public class EmprestimoPessoal extends Emprestimo{
    public EmprestimoPessoal(double valorEmprestado){
        super(valorEmprestado);
    }
    @Override
    public double calcularParcela(int meses){
        return valorEmprestado * 0.02 * meses;
    }
}
