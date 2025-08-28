package Semana5.Colections.s5Exerc06;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        adicionarCliente(clientes, "alefe", 1200);
        adicionarCliente(clientes, "arthur", 1500);
        adicionarCliente(clientes, "Ana", 2300);
        adicionarCliente(clientes, "Pedro", 5300);
        ordenarPorSaldo(clientes);
        exibirClientes(clientes);

    }
    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        clientes.add(new Cliente(nome, saldo));
    }

    public static void exibirClientes(List<Cliente> clientes){
        for (Cliente cliente: clientes){
            System.out.printf("Cliente: %s - Saldo %.2f\n", cliente.getNome(), cliente.getSaldo());
        }
    }
    public static void ordenarPorSaldo(List<Cliente> clientes){
        clientes.sort((c1, c2) -> Double.compare(c2.saldo, c1.saldo));
    }
}
