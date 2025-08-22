package br.com.devsdoagi.Maratonas.MaratonaPooVarejo;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Alefe Gomes Damasceno");
        cliente1.setEmail("2006.alefedamasceno@gmail.com");

        Produto produto1 = new ProdutoFisico(100, "10024"
                , "Pedro Lima", cliente1);
        Produto produto2 = new ProdutoDigital(300, "1023"
                , "Carlos Henrique", cliente1);

        produto1.aplicarDesconto(20);
        produto1.calcularFrete();

        produto2.aumentarPreco(30);
        produto2.calcularFrete();
    }
}
