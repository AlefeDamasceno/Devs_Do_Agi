package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc04;

public class EmprestimoPessoal extends Emprestimo{
    public EmprestimoPessoal(){
        super();
    }
    public EmprestimoPessoal(double valor, double taxaJuros){
        super(valor, taxaJuros);
    }

    @Override
    public double calcularParcela(int meses){
        return (this.valor * ((1 + this.taxaJuros/100) * meses)) / meses;
    }
}
