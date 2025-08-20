package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc03;

public class EmprestimoEmpresarial extends Emprestimo{
    public EmprestimoEmpresarial(double valorEmprestado){
        super(valorEmprestado);
    }
    @Override
    public double calcularParcela(int meses){
        return (valorEmprestado * 0.01 * meses) + 100;
    }
}
