package br.com.devsdoagi.Maratonas.MaratonaPooVarejo;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(double preco, String codigo,
                          String nome, Cliente comprador){
        super(preco, codigo, nome, comprador);
    }

    @Override
    public void calcularFrete(){
        System.out.println("Não há frete!");
        System.out.printf("Preço com frete: R$ %.2f!",
                getPreco());
    }
}
