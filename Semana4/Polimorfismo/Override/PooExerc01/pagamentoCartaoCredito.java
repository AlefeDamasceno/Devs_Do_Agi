package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc01;

public class pagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;

    public pagamentoCartaoCredito(String numeroCartao, double valor){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("Numero cartao: %s - valor: R$ %.2f\n", this.numeroCartao, this.valor);
    }
}
