package br.com.devsdoagi.Semana4.Encapsulamento.PooExerc2;

public class Main {
    public static void main(String[] args) {
        ClienteVip cliente1 = new ClienteVip();

        cliente1.setNome("Alefe Gomes");
        cliente1.setCpf("999.999.999-99");
        cliente1.setLimiteCredito(100000);

        cliente1.exibirCliente();
    }
}
