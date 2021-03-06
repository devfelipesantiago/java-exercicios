package lambda.predicate;

import lambda.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(Product::staticProductPredicate);
        list.removeIf(Product::nonStaticProductPredicate);
        list.removeIf((product -> product.getPrice() >= 100));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
