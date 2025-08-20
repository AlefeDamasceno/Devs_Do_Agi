package br.com.devsdoagi.Semana4.Polimorfismo.Overload.PooExerc02;

public class MainCarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        double valor1 = carrinho1.somaTotal(10, 20);
        double valor2 = carrinho1.somaTotal(10, 20, 10);
        double valor3 = carrinho1.somaTotal(10, 20 , 30, 40, 50);

        System.out.printf("%.2f - %.2f - %.2f", valor1, valor2, valor3);
    }
}
