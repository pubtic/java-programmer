package dz.solutions.developemnt.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void testRunable() {
        Robot robot1 = new Robot("Mobile");
        FactoryRobot robot2 = new FactoryRobot("Factory");
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(2);
            service.execute(robot1);
            service.execute(robot2);
        } finally {
            if(service != null) service.shutdown();
        }
    }

    @Test
    public void testAvailableProcessors() {
        int processors = Runtime.getRuntime().availableProcessors();
        assertEquals(12, processors);
    }
}
