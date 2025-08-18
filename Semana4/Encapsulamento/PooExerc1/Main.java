package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta("080014");

        conta1.setTitular("Alefe Gomes");

        conta1.Sacar(10);
        conta1.Depositar(1000);
        conta1.Sacar(50);


        conta1.exibirInformacoes();

        conta1.Sacar(900);
        conta1.exibirInformacoes();

    }
}
