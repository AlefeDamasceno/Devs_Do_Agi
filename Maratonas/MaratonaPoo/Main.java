package br.com.devsdoagi.Maratonas.MaratonaPoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        cliente1.setNome(nome);
        cliente1.setCpf(cpf);

        System.out.println("Digite o numero da conta poupança:");
        String numeroPoup = sc.nextLine();

        Conta contaPoupCliente1 = new ContaPoupanca(numeroPoup, cliente1, 0);

        System.out.println("Valor a depositar: ");
        double valor_deposito = sc.nextDouble();
        contaPoupCliente1.depositar(valor_deposito);

        System.out.println("Valor a sacar: ");
        double valor_saque = sc.nextDouble();
        contaPoupCliente1.sacar(valor_saque);
        sc.nextLine();

        contaPoupCliente1.aplicarJuros();

        System.out.println("\n=== DADOS CONTA POUPANÇA ===\n");
        System.out.printf("Nome: %s\nCPF: %s\nNum. Conta: %s\nSaldo Atual: %.2f\n", cliente1.getNome(),
                cliente1.getCpf(), contaPoupCliente1.getNumeroConta(),contaPoupCliente1.getSaldo());
        System.out.println("\n=== === === === === === ===");

        System.out.println("\nDigite o numero da conta corrente: ");
        String numeroCC = sc.nextLine();

        Conta contaCorrenteCliente1 = new ContaCorrente(numeroCC, cliente1, 0);

        System.out.println("Valor a depositar: ");
        valor_deposito = sc.nextDouble();
        contaCorrenteCliente1.depositar(valor_deposito);

        System.out.println("Valor a sacar: ");
        valor_saque = sc.nextDouble();
        contaCorrenteCliente1.sacar(valor_saque);

        contaCorrenteCliente1.aplicarJuros();

        System.out.println("\n=== DADOS CONTA CORRENTE ===\n");
        System.out.printf("Nome: %s\nCPF: %s\nNum. Conta: %s\nSaldo Atual: %.2f\n", cliente1.getNome(),
                cliente1.getCpf(),contaCorrenteCliente1.getNumeroConta() ,contaCorrenteCliente1.getSaldo());
        System.out.println("\n=== === === === === === ===");
    }
}
