package dz.solutions.developemnt.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testThreadCounter() {
        new Car("BMW").start();
        new Car("TOYOTA").start();
        new Car("VV").start();
        assertEquals(3, Car.counter);
    }
}
