package br.com.devsdoagi.Semana4.ClassObj.PooExerc03;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao(){
        double media = calcularMedia();

        if(media >= 6){
            return "Aprovado";
        }else if (media < 6 && media >= 5 ){
            return "Recuperação";
        }else{
            return "Reprovado";
        }
    }

    public void exibirResultado(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Nota1: %.2f\n", nota1);
        System.out.printf("Nota2: %.2f\n", nota2);
        System.out.printf("Media: %.2f\n", calcularMedia());
        System.out.printf("Situação: %s\n", verificarSituacao());

    }
}
