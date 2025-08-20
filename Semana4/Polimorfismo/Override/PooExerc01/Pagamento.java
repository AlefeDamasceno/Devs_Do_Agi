package br.com.devsdoagi.Semana4.Polimorfismo.Override.PooExerc01;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void processarPagamento(){
        System.out.printf("Processando pagamento valor %.2f genérico!\n", this.valor);
    }
}
