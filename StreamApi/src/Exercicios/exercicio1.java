package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio1 {
    public static void main(String[] args) {
        // Abaixo serve para declarar o array List vazio
            List<Integer> numbers =  new ArrayList<>();
        // Abaixo estamos implementando posição por posição.
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
        //Abaixo estamos declarando um arry como lista já com as posições preenchidas.
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Abaixo criamos um stream através do arraylist e ordenamos em ordem normal (sorted).
            List<Integer> numerosOrdenados = numeros.stream()
                                            .sorted()
                                            .collect(Collectors.toList()); // Coleta os valores em uma lista nova

            List<Integer> numerosOrdenados1 = numbers.stream()
                                            .sorted()
                                            .collect(Collectors.toList()); // Coleta os valores em uma lista nova

        System.out.println(numerosOrdenados);
        System.out.println(numerosOrdenados1);
                        
    }

}
