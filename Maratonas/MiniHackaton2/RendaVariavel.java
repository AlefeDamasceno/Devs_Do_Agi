package br.com.devsdoagi.Maratonas.MiniHackaton2;
//Criacao da subclasse RendaVariavel
public class RendaVariavel extends Investimento{

    //Construtor com parametro
    public RendaVariavel(double valorInicial){
        super(valorInicial);
    }

    //Sobrescrita no metodo calcularRendimento
    @Override
    public double calcularRendimento(){
        return getValorInicial() * 1.1;
    }
}
