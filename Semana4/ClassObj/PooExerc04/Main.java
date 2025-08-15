package br.com.devsdoagi.Semana4.ClassObj.PooExerc04;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Honda Civic";
        meuCarro.consumoPorKm = 10;

        meuCarro.calcularConsumo(100);
        meuCarro.exibirDados();
    }
}
