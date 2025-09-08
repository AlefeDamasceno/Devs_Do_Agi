package Semana6.s6Exerc08;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Alefe Gomes", 1200, 1,
                "C/C"));
        contas.add(new Conta("Arthur Gomes", 900, 2,
                "Poupança"));
        contas.add(new Conta("Maiara Cristina", 2400, 3,
                "C/C"));
        contas.add(new Conta("Ana Luiza", 4500, 4,
                "Poupança"));

//        List<Conta> contasMaior1000 =
//                contas.stream().filter(n -> n.getSaldo() > 1000).toList();
//        for (Conta  item : contasMaior1000){
//            System.out.println(item);
//        }

//        List<String> nomesTitulares =
//                contas.stream().map(conta -> conta.getTitular()).toList();
//        for(String item : nomesTitulares){
//            System.out.println(item);
//        }

//        double saldoTotal =
//                contas.stream().mapToDouble(conta -> conta.getSaldo()).sum();
//        System.out.println(saldoTotal);


    }
}
