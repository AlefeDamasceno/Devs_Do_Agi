package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc01;

public class pagamentoPix extends Pagamento{
    private String chavePix;

    public pagamentoPix(String chavePix, double valor){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(){
        System.out.printf("Chave pix: %s - Valor: R$ %.2f\n", this.chavePix, this.valor);
    }
}
