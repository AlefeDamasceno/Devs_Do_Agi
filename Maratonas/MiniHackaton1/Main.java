package br.com.devsdoagi.Maratonas.MiniHackaton1;

public class Main {
    public static void main(String[] args) {
        //Criando objeto gerente vazio (sem parametro)
        Gerente gerente = new Gerente();

        //Atribuindo valores ao nome e salário
        gerente.setNome("Alefe Gomes");
        gerente.setSalario(2500);

        System.out.println("=== RELATÓRIO GERENTE ===");
        System.out.printf("Nome: %s\nSalário: R$ %.2f\nBônus: R$ %.2f\nSalário Final: R$ %.2f\n", gerente.getNome(),
                gerente.getSalario(), gerente.getBonus(), gerente.getSalarioFinal());

        //Criando objeto analista com parâmetro
        Analista analista = new Analista("Ana luiza", 3200);

        //Não precisa atribuir valor novamente..
        System.out.println("\n=== RELATÓRIO ANALISTA ===");
        System.out.printf("Nome: %s\nSalário: R$ %.2f\nBônus: R$ %.2f\nSalário Final: R$ %.2f\n", analista.getNome(),
                analista.getSalario(), analista.getBonus(), analista.getSalarioFinal());
    }
}
