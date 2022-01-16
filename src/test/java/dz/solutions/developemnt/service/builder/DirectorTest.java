package dz.solutions.developemnt.service.builder;

import dz.solutions.developemnt.builder.Car;
import dz.solutions.developemnt.builder.Director;
import dz.solutions.developemnt.builder.IBuilder;
import dz.solutions.developemnt.builder.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DirectorTest {

    @Test
    public void testConstruct() {
        Director director = new Director();
        IBuilder car = new Car();
        Product product = director.construct(car);
        assertNotNull(product);
    }
}
