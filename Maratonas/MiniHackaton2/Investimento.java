package br.com.devsdoagi.Maratonas.MiniHackaton2;

//Criando a classe abstrata
abstract class Investimento {
    private double valorInicial;

    //Construtor vazio
    public Investimento(){
        this.valorInicial = 0.0;
    }
    //Construtor com parâmetro
    public Investimento(double valorInicial){
        this.valorInicial = valorInicial;
    }

    //Getter valorInicial
    public double getValorInicial(){
        return valorInicial;
    }

    //Metodo abstrato calcularRendimento
    public abstract double calcularRendimento();
}
