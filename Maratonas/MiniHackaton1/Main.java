package br.com.devsdoagi.Maratonas.MiniHackaton1;

public class Main {
    public static void main(String[] args) {
        //Criando objeto gerente vazio (sem parametro)
        Gerente gerente = new Gerente();

        //Atribuindo valores ao nome e salário
        gerente.setNome("Alefe Gomes");
        gerente.setSalario(2500);

        gerente.exibirRelatorio();

        //Criando objeto analista com parâmetro
        Analista analista = new Analista("Ana luiza", 3200);

        //Não precisa atribuir valor novamente..
        analista.exibirRelatorio();
    }
}
