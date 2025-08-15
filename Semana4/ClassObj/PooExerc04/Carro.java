package br.com.devsdoagi.Semana4.ClassObj.PooExerc04;

public class Carro {
    public String modelo;
    public double consumoPorKm;
    private double consumo_viagem;

    public double calcularConsumo(double distancia){
        consumo_viagem = distancia/consumoPorKm;
        return consumo_viagem;
    }

    public void exibirDados(){
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Consumo por KM: %.2f\n", consumoPorKm);
        System.out.printf("Consumo pra viagem: %.2f L!\n", consumo_viagem);
    }
}
