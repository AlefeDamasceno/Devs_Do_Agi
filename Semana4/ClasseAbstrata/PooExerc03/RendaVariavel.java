package br.com.devsdoagi.Semana4.ClasseAbstrata.PooExerc03;

public class RendaVariavel extends Investimento{
    public RendaVariavel(){
        super();
    }
    @Override
    public double calcularRendimento(){
        double valor_final = getvalorAplicado()*1.1;
        setValorAplicado(valor_final);
        return valor_final;
    }
}
