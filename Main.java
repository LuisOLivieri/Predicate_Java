import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(Product::staticProductPredicate); METHOD REFERENCE
        //list.removeIf(Product::nonStaticProductPredicate); NAO ESTATICO
        //double min = 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min; //FUNC P RESULTA BOOLEAN

        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Product p : list){ //PARA CADA PRODUTO P NA MINHA LISTA
            System.out.println(p);
        }
    }
}