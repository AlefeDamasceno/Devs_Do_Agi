package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc05;

public class Main {
    public static void main(String[] args) {
        Cambio cambio1 = new CambioDolar(400, 10);
        Cambio cambio2 = new CambioEuro();

        double valor_convertido = cambio1.converter();
        System.out.println(valor_convertido);

        cambio2.setValorEmReais(600);
        cambio2.setTaxaCambio(40);
        double valor_convertido1 = cambio2.converter();
        System.out.println(valor_convertido1);
    }
}
