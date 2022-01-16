package dz.solutions.developemnt.service.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotTest {
    @Test
    @DisplayName("test Singleton")
    public void testSingleton() {
        Robot robot1 = Robot.getInstance();
        Robot robot2 = Robot.getInstance();
        Robot robot3 = new Robot();
        assertTrue(robot1 == robot3);
    }
}
