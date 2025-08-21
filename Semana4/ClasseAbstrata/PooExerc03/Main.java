package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc03;

public class Main {
    public static void main(String[] args) {
        Investimento invest1 = new RendaFixa();
        Investimento invest2 = new RendaVariavel();

        invest1.setValorAplicado(1000);
        double rendimento = invest1.calcularRendimento();
        System.out.println(rendimento);

        invest2.setValorAplicado(1000);
        double rendimento1 = invest2.calcularRendimento();
        System.out.println(rendimento1);
    }
}
