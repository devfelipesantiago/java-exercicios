package lambda.function.application;

import lambda.function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        List<String> name = list.stream()
                .map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        name.forEach(System.out::println);
    }
}
