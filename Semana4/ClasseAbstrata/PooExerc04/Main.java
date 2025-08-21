package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc04;

public class Main {
    public static void main(String[] args) {
        Emprestimo emp1 = new EmprestimoPessoal(200, 4);
        Emprestimo emp2 = new EmprestimoEmpresarial(200, 4);

        double valorparcela1 = emp1.calcularParcela(3);
        double valorparcela2 = emp2.calcularParcela(3);
        System.out.printf("%.2f - %.2f", valorparcela1, valorparcela2);
    }
}
