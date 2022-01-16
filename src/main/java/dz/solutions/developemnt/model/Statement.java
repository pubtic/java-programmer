package dz.solutions.developemnt.model;

import java.util.Arrays;

public class Statement {

    public Boolean ifTest(Integer age) {
        // return true if age is old then 30
        return age > 30 ? true : false;
    }
    public Age switchTest(Integer age) {
        Age result ;
        switch (age) {
            case 10:
                result = Age.CATEGORY_1;
            break;
            case 20:
                result = Age.CATEGORY_2;
            break;
            case 30:
                result = Age.CATEGORY_3;
            break;
            default:
                result = Age.CATEGORY_4;
            break;
        }
        return result;
    }
    public String justAnotherMethod(String value){
        return value.toUpperCase();
    }

    public Product[] whileTest(int max) {
        int i = 0;
        Product[] products = new Product[max];
        while (i <= max - 1 ) {
            Product product = new Product(i, "name", "description", 10);
            product.setId(i);
            products[i] = product;
            i++;
        }
        return products;
    }
}
