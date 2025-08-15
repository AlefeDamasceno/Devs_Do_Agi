package br.com.devsdoagi.Semana4.PooIntro1;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        //Atribuindo valores
        meuCarro.ano = 2020;
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla Cross";

        //chama o métodoo "exibirInformações" do objeto
        meuCarro.exibirInformacoes();

        meuCarro.acelerar();
        meuCarro.frear();
    }
}
