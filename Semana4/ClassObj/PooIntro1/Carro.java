package br.com.devsdoagi.Semana4.ClassObj.PooIntro1;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public void acelerar(){
        System.out.println("O carro está acelerando.");
    }

    public void frear(){
        System.out.println("O carro está freando");
    }

    public void exibirInformacoes(){
        System.out.printf("Modelo: %s\n", this.modelo);
        System.out.printf("Marca: %s\n", this.marca);
        System.out.printf("Ano: %d\n", this.ano);
    }
}
