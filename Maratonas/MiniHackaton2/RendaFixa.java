package br.com.devsdoagi.Maratonas.MiniHackaton2;

//Subclasse RendaFixa
public class RendaFixa extends Investimento{

    //Construtor com parâmetro
    public RendaFixa(double valorInicial){
        super(valorInicial);
    }

    //Sobrescrita no metodo calcularRendimento
    @Override
    public double calcularRendimento(){
        return getValorInicial() * 1.05;
    }
}
