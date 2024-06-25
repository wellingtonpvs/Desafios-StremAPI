package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble mediaMaiorQueCinco = numeros.stream()
                                           .filter(n -> n >= 5)
                                           .mapToInt(Integer::intValue)
                                           .average();
    System.out.println(mediaMaiorQueCinco);
    }
    
    
}
