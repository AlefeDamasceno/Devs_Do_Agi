package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc02;

public class Main {
    public static void main(String[] args) {
        Cartao c1 = new CartaoDebito();
        Cartao c2 = new CartaoCredito();

        c1.setLimite(2000);
        c1.processarCompra(1000);
        double saldo = c1.getLimite();
        System.out.println(saldo);

        c2.setLimite(3000);
        c2.processarCompra(1500);
        double saldo1 = c2.getLimite();
        System.out.println(saldo1);
    }
}
