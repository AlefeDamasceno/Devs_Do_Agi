package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc03;

public class RendaFixa extends Investimento {
    public RendaFixa(){
        super();
    }
    @Override
    public double calcularRendimento(){
        double valor_final = getvalorAplicado()*1.05;
        setValorAplicado(valor_final);
        return valor_final;
    }
}
