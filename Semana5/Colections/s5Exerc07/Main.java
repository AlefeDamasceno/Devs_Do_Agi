package br.com.devsdoagi.Semana5.Colections.s5exerc05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        cadastrarCliente(clientes, "001", "Alefe Gomes", "90120931");
        cadastrarCliente(clientes, "002", "Arthur Damasceno", "192030123");
        exibirClientes(clientes);

    }
    public static void cadastrarCliente(List<Cliente> clientes, String id, String nomeCliente, String cpf){
        clientes.addLast(new Cliente(id, nomeCliente, cpf));
    }
    public static void exibirClientes(List<Cliente> clientes){
        int i = 1;
        for(Cliente cliente: clientes){
            System.out.printf("Cliente %d: %s\n", i, cliente.getNome());
            i++;
        }
    }
}
