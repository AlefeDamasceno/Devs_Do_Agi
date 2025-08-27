package br.com.devsdoagi.Semana5.Colections.s5Exerc03;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <String, Double> clientes = new HashMap<>();
        adicionarCliente(clientes, "10024", 2000);
        depositar(clientes, "10024", 2000, 2000);
        exibirSaldos(clientes);
    }
    public static void adicionarCliente(Map <String, Double> clientes, String numeroConta, double saldoInicial){
        clientes.put(numeroConta, saldoInicial);
    }
    public static void depositar(Map<String, Double> clientes, String numeroConta, double saldoInicial, double valor){
        if(clientes.containsKey(numeroConta)){
            clientes.get(numeroConta);
            clientes.put(numeroConta, saldoInicial + valor);
        }else{
            System.out.println("Conta não existente!");
        }
    }
    public static void exibirSaldos(Map<String, Double> clientes){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf("Cliente %d - Saldo: R$ %s", i+1, clientes.values());
        }
    }
}
