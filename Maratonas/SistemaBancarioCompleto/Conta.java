package hackaton.SistemaBancarioCompleto;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Dicas para os métodos a implementar:

    public void depositar(double valor) {
        // - depositar(double valor): adicionar ao saldo, registrar transação
        if (valor > 0) {
            saldo += valor;
            extrato.add(new Transacao("Depósito", valor,
                    getNumero(), getNumero()));
        }
    }

    public void sacar(double valor){
        // - sacar(double valor): verificar saldo, subtrair valor, registrar transação
        if (saldo >= valor){
            saldo -= valor;
            extrato.add(new Transacao("Saque", valor,
                    getNumero(), getNumero()));
        }
    }

    public void transferir(double valor, Conta destino){
        // - transferir(double valor, Conta destino): verificar saldo, atualizar saldos, registrar transações em ambas contas
        if(saldo > valor){
            saldo -= valor;
            extrato.add(new Transacao("Transferencia",
                    valor, getNumero(),
                    destino.getNumero()));

            destino.saldo += valor;
            destino.extrato.add(new Transacao(
                    "Transferencia", valor, getNumero(),
                    destino.getNumero()));
        }
    }

    public void mostrarExtrato(){
        // - mostrarExtrato(): percorrer lista de transações e imprimir
        extrato.forEach(System.out::println);
    }

}

