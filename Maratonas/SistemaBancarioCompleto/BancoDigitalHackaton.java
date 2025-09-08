package hackaton.SistemaBancarioCompleto;
import java.util.*;
import java.util.stream.Collectors;

public class BancoDigitalHackaton {
    private static final Set<Cliente> clientes = new HashSet<>();
    private static final Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarCliente(sc); break;
                case 2:
                    cadastrarConta(sc); break;
                case 3:
                    deposito(sc); break;
                case 4:
                    sacar(sc); break;
                case 5:
                    transferencia(sc); break;
                case 6:
                    consultarSaldo(sc); break;
                case 7:
                    extrato(sc); break;
                case 8:
                    listarClientes(); break;
                case 9:
                    rodando = false; break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    private static void cadastrarCliente(Scanner sc) {
        System.out.println("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        Cliente novoCliente = new Cliente(nome, cpf);
        if (clientes.contains(novoCliente)){
            System.out.println("Cliente já existe!");
        } else {
            clientes.add(novoCliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    private static void cadastrarConta(Scanner sc) {
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        // Busca o cliente pelo CPF
        Cliente titular = clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if (titular != null) {
            Conta novaConta = new Conta(numeroConta, titular);
            contas.put(numeroConta, novaConta);
            System.out.println("Conta criada com sucesso! Número: " + numeroConta);
            numeroConta++;
        } else {
            System.out.println("Cliente inexistente! Tente novamente.");
        }
    }

    public static void deposito(Scanner sc){
        System.out.println("Digite o numero da conta: ");
        int numeroContaConsultar = sc.nextInt();

        if(contas.containsKey(numeroContaConsultar)){
            Conta conta = contas.get(numeroContaConsultar);
            System.out.println("Qual valor deseja " +
                    "depositar?");
            double valor = sc.nextDouble();

            if (valor > 0){
                conta.depositar(valor);
            }else{
                System.out.println("Valor inválido!");
            }
        }else{
            System.out.printf("Cliente numero %d " +
                    "inexistente!", numeroContaConsultar);
        }
    }

    public static void sacar(Scanner sc){
        System.out.println("Digite o numero da conta: ");
        int numeroContaConsultar = sc.nextInt();

        if(contas.containsKey(numeroContaConsultar)){
            Conta conta = contas.get(numeroContaConsultar);

            System.out.println("Qual valor deseja " +
                    "sacar?");
            double valor = sc.nextDouble();
            if(conta.getSaldo() > valor){
                conta.sacar(valor);
            }else{
                System.out.println("Valor inválido!");
            }
        }
    }

    public static void transferencia(Scanner sc){
        System.out.println("Numero Conta Origem:");
        int contaOrigem = sc.nextInt();

        System.out.println("Numero Conta Destino:");
        int contaDestino = sc.nextInt();

        if (contas.containsKey(contaOrigem) && contas.containsKey(contaDestino)){
            Conta objContaOrigem = contas.get(contaOrigem);
            Conta objContaDestino =
                    contas.get(contaDestino);

            System.out.println("Contas válidas!");

            System.out.println("Digite o valor da " +
                    "transferencia:");
            double valor = sc.nextDouble();
            objContaOrigem.transferir(valor,
                    objContaDestino);

        }else{
            System.out.println("Contas inválidas! Tente " +
                    "Novamente");
        }
    }

    public static void consultarSaldo(Scanner sc){
        System.out.println("Digite o numero da conta: ");
        int numeroContaConsultar = sc.nextInt();

        if (contas.containsKey(numeroContaConsultar)){
            Conta conta = contas.get(numeroContaConsultar);
            System.out.printf("Saldo Atual: R$ %.2f",
                    conta.getSaldo());
        }else{
            System.out.println("Conta não registrado!");
        }
    }

    public static void extrato(Scanner sc){
        System.out.println("Digite o numero da conta: ");
        int numeroContaConsultar = sc.nextInt();

        if (contas.containsKey(numeroContaConsultar)){
            Conta conta = contas.get(numeroContaConsultar);
            System.out.printf("=-=-= Extrato Cliente %d " +
                    "=-=-=\n", numeroContaConsultar);
            conta.mostrarExtrato();
            System.out.println("=-=-==-=-==-=-=");
        }else{
            System.out.println("Conta não registrado!");
        }
    }
    private static void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        clientes.forEach(System.out::println);
    }
}
