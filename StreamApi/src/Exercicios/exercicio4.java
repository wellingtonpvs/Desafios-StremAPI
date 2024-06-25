package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio4 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Abaixo usamos o stream para atribuir o valor da lista criada acima a uma nova lista.
        List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0) // Verificar se o numero é par 
                                            .collect(Collectors.toList()); // Coleta os valores em uma lista nova

        System.out.println(numerosPares);

    }
    
}
