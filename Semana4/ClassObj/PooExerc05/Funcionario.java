package br.com.devsdoagi.Semana4.ClassObj.PooExerc05;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;
    public double descontoIR;

    public double calcularSalarioLiquido(){
        return salarioBruto - salarioBruto*descontoINSS - salarioBruto*descontoIR;
    }
    public void exibirFolhaPagamento(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário Bruto: %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS: %.2f\n", descontoINSS);
        System.out.printf("Desconto IR: %.2f\n", descontoIR);
        System.out.printf("\nSalário Liquido: R$ %.2f\n", calcularSalarioLiquido());
    }
}
