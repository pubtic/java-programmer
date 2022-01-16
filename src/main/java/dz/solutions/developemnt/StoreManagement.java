package dz.solutions.developemnt;

import dz.solutions.developemnt.model.Product;
import dz.solutions.developemnt.model.Statement;

import java.util.Arrays;
import java.util.List;


public class StoreManagement {
    public static void main(String[] args) {
        Statement statement = new Statement();
        System.out.println(statement.ifTest(25));
        System.out.println(statement.switchTest(20));
        Product[] products = statement.whileTest(5);
        for(Product product : products) {
            product.setPrice(5);
        }
        List<Product> productsList = Arrays.stream(products).toList();
        productsList.add(new Product(5, "product1", "product1", 10));
        for(Product product : productsList) {
            System.out.println(product);
        }
    }
}
