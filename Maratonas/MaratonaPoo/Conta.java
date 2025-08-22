package br.com.devsdoagi.Maratonas.MaratonaPoo;

abstract class Conta implements OperacoesBancarias{
    private String numeroConta;
    private Cliente titular;
    private double saldo;

    public Conta(){
        this.numeroConta = null;
        this.titular = null;
        this.saldo = 0.0;
    }

    public Conta(String numeroConta, Cliente titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        if (saldo > 0){
            this.saldo = saldo;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    @Override
    public void depositar(double valor){
        if (valor > 0){
            double saldoAtual = getSaldo() + valor;
            setSaldo(saldoAtual);
        }else{
            System.out.println("Valor inválido! Tente Novamente");
        }
    }

    @Override
    public void sacar(double valor){
        if (valor <= this.saldo) {
            double saldoAtual = getSaldo() - valor;
            setSaldo(saldoAtual);
        }else{
            System.out.println("Valor inválido! Tente Novamente");
        }
    }

    public abstract void aplicarJuros();
}
