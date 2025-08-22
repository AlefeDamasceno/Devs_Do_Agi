package br.com.devsdoagi.Maratonas.MaratonaPooVarejo;

public class ProdutoFisico extends Produto{
    public ProdutoFisico(double preco, String codigo,
                         String nome, Cliente comprador){
        super(preco, codigo, nome, comprador);
    }

    @Override
    public void calcularFrete(){
        System.out.println("Frete fixo de R$ 20,00!");
        double precoAtual = getPreco() + 20;
        System.out.printf("Preco com frete: R$ %.2f!",
                precoAtual);
        setPreco(precoAtual);
    }
}
