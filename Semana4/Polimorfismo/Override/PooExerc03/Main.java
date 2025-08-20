package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc03;

public class Main {
    public static void main(String[] args) {

        Emprestimo[] emprestimos = {
                new Emprestimo(1200),
                new EmprestimoPessoal(2000),
                new EmprestimoEmpresarial(4000)
        };

        for (int i = 0; i < 2; i++) {
            System.out.printf("Emprestimo %d:\n", i+1);
            for (int j = 1; j <= 12; j++) {
                System.out.printf("Valor parcela mês %d: R$ %.2f\n", j , emprestimos[i].calcularParcela(j));
            }
        }
    }
}
