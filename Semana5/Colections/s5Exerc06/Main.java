package br.com.devsdoagi.Semana5.Colections.s5Exerc06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        adicionarCliente(clientes, "alefe", 1200);

    }
    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        clientes.add(new Cliente(nome, saldo));
    }

    public void exibirClientes(List<Cliente> clientes){
        for (int i = 0; i < clientes.size(); i++) {

        }
    }
}
