package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc01;

public class Main {
    public static void main(String[] args) {
        Pagamento[] vet = {
                new Pagamento(100),
                new pagamentoCartaoCredito("1004", 200),
                new pagamentoPix("51493320890", 2000)
        };

        for (int i = 0; i < vet.length; i++) {
            vet[i].processarPagamento();
        }
    }
}
