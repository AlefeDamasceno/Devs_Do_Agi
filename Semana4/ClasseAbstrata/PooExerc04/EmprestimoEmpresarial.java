package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc04;

public class EmprestimoEmpresarial extends Emprestimo{
    public EmprestimoEmpresarial(){
        super();
    }
    public EmprestimoEmpresarial(double valor, double taxaJuros){
        super(valor, taxaJuros);
    }

    @Override
    public double calcularParcela(int meses) {
        Emprestimo emp = new EmprestimoPessoal(this.valor, this.taxaJuros);
        return emp.calcularParcela(meses)*0.9;
    }
}