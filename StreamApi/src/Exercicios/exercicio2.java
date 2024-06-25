package Exercicios;

import java.util.Arrays;
import java.util.List;

public class exercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Abaixo criamos uma variavel que recebe o valor da soma dos numeros pares da lista
        int somaPares = numeros.stream()
                                .filter(n -> n %2 == 0 ) // verifica se o numero é par
                                .mapToInt(Integer::intValue) //Converte para IntStream
                                .sum(); // Soma os elementos do intStream
        
        System.out.println(somaPares);
        
    }
}
