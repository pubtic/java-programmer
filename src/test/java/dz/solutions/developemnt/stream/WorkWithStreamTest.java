package dz.solutions.developemnt.stream;


import dz.solutions.developemnt.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkWithStreamTest {

    @Test
    public void testGetMax() {
        var max = WorkWithStream.getMax(List.of(88, 55,66));
        assertEquals(66, max);
    }

    @Test
    public void testGetMin() {
        var min = WorkWithStream.getMin(List.of(1, 2, 3));
        assertEquals(1, min);
    }

    @Test
    public void testGetMaxString() {
        var maxString = WorkWithStream.getMaxString(List.of("Ali", "Mohammed", "Ironman"));
        assertEquals("Mohammed", maxString);
    }

    @Test
    public void testGetMaxPriceProduct() {
        List<Product> products = List.of(new Product(1, "product1", "product1", 10),
                new Product(2, "product2", "product2", 30),
                new Product(3, "product3", "product3", 40));
        Product product =  WorkWithStream.getMaxPriceProduct(products);
        assertEquals(10, product.getPrice());

    }

    @Test
    public void testLongExecution() {
        System.out.println("start");
        for(var i = 1; i <= Integer.MAX_VALUE; i++) {
            System.out.println("print" + i);
        }
        for(var i = 1; i <= Integer.MAX_VALUE; i++) {
            System.out.println("print" + i);
        }
        for(var i = 1; i <= Integer.MAX_VALUE; i++) {
            System.out.println("print" + i);
        }
        System.out.println("end");
    }
}
