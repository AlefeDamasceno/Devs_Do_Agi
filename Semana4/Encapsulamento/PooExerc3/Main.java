package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.Imprimir();

        ContaBancaria conta2 = new ContaBancaria("Alefe", "2004");
        conta2.Imprimir();

        ContaBancaria conta3 = new ContaBancaria("Alefe", "2005", 123);
        conta3.Imprimir();
    }
}
