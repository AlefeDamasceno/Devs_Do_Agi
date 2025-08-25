package br.com.devsdoagi.Maratonas.MiniHackaton1;
//Criando subclasse Analista
public class Analista extends Funcionario {
    //Construtor vazio
    public Analista() {
        super();
    }

    //Construtor com parâmetro
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    //método que retorna bonus
    public double getBonus() {
        return 1000.0;
    }

    //Metodo que retorna salario final
    public double getSalarioFinal() {
        return getSalario() + getBonus();
    }
}
