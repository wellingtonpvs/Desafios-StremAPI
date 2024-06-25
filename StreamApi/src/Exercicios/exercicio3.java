package Exercicios;

import java.util.Arrays;
import java.util.List;

public class exercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Abaixo criamos a variavel numerosPositivos e atibuimos a ela a lista criada anteriormente.
        boolean numerosPositivos = numeros.stream()
                                         .allMatch(n-> n > 0); // verifica se tudo encontrado atende as condições implementadas ( n > 0)
        
        System.out.println(numerosPositivos);
                                    
        
    }
    
}
