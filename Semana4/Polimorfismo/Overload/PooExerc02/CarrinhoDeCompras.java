package br.com.devsdoagi.Semana4.Polimorfismo.Overload.PooExerc02;

public class CarrinhoDeCompras {
    public double somaTotal(double preco1, double preco2){
        return preco1 + preco2;
    }
    public double somaTotal(double preco1, double preco2, double desconto){
        return (preco1 + preco2) - ((preco1 + preco2) * desconto/100);
    }
    public double somaTotal(double ...precos){
        double total=0;
        for (double p : precos){
            total += p;
        }
        return total;
    }
}
