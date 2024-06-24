package TestelLambdaInicial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Exibir os itens");

        // Exibir os itens da Lista com Expressão Lambda
        numeros.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nExibir os itens somados com eles mesmos");

        // Exibir os itens da Lista dobrados com Expressão Lambda
        numeros.forEach(n -> System.out.print(n + n + " "));

        System.out.println("\n\nExibir os itens pares da lista");

        // Exibir apenas os elementos pares da Lista com Expressão Lambda
        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.print(n + " ");
        });
        System.out.println();
        System.out.println();

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        double min = 100;

        list.removeIf(p -> p.getPrice() >= min);

        list.forEach(System.out::println);

       list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        list.forEach(System.out::println);

    }
}
