package hackaton.SistemaBancarioPOObasic;

abstract class Conta implements OperacoesBancarias{
    private String numeroConta;
    private Cliente titular;
    private double saldo;

    public Conta(){
        this.numeroConta = null;
        this.titular = null;
        this.saldo = 0;
    }
    public Conta(String numeroConta, Cliente titular,
                 double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    @Override
    public void sacar(double valor){
        if(saldo > valor){
            this.saldo -= valor;
        }
    }
}