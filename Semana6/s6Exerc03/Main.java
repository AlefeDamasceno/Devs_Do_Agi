package Semana6.s6Exerc03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(2);
        inteiros.add(4);
        inteiros.add(7);
        inteiros.add(6);
        inteiros.add(5);
        inteiros.add(23);
        inteiros.add(17);

        int somaNumeros = inteiros.stream().reduce(0, (a,
                b) -> a+b);
        System.out.println(somaNumeros);
    }
}
