package Semana6.s6Exerc02;

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

        List<Integer> maiores10 =
                inteiros.stream().filter(n-> n > 10).toList();
        for(Integer item : maiores10){
            System.out.println(item);
        }
    }
}
