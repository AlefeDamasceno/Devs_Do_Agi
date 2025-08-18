    package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc3;

    public class ContaBancaria {
        private String titular;
        private String numeroConta;
        private double saldo;

        public ContaBancaria(){
            this.titular = "";
            this.numeroConta = "";
            this.saldo = 0.0;
        }

        public ContaBancaria(String titular, String numeroConta){
            this.titular = titular;
            this.numeroConta = numeroConta;
            this.saldo = 0;
        }

        public ContaBancaria(String titular, String numeroConta, double saldo){
            this.titular = titular;
            this.numeroConta = numeroConta;
            this.saldo = saldo;
        }

        public void Imprimir(){
            System.out.printf("Titular: %s\n", this.titular);
            System.out.printf("Numero COnta: %s\n", this.numeroConta);
            System.out.printf("Saldo: %.2f\n", this.saldo);
        }
    }
