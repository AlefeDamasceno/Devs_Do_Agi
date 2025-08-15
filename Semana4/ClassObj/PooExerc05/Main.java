package br.com.devsdoagi.Semana4.ClassObj.PooExerc05;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();

        func1.nome = "Alefe Gomes";
        func1.salarioBruto = 1000;
        func1.descontoINSS = 0.11;
        func1.descontoIR = 0.075;

        func1.exibirFolhaPagamento();
    }
}
