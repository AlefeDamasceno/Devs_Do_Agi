package br.com.devsdoagi.Maratonas.MiniHackaton1;
//Criando subClasse Gerente

public class Gerente extends Funcionario{
    //Construtor vazio
    public Gerente(){
        super();
    }
    //Construtor com parâmetros
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    //Método que retorna bonus
    public double getBonus(){
        return 2000.0;
    }

    //Metodo que retorno salarioFinal
    public double getSalarioFinal(){
        return getSalario() + getBonus();
    }

    public void exibirRelatorio(){
        System.out.println("=== RELATÓRIO GERENTE ===");
        System.out.printf("Nome: %s\nSalário: R$ %.2f\nBônus: R$ %.2f\nSalário Final: R$ %.2f\n", getNome(),
                getSalario(), getBonus(), getSalarioFinal());
    }
}
