package dz.solutions.developemnt.function;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class FunctionTest {
    @Test
    public void testFunction() {
        Consumer<String> consumer = (String message) -> System.out.println(message);
        consumer.accept("mohammed");
    }
}
