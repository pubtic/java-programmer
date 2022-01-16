package dz.solutions.developemnt.service.singleton;

public class Robot {
    private static Robot robot = null;

    public Robot() {
    }

    public static Robot getInstance() {
        if(robot == null) {
            robot = new Robot();
        }
        return robot;
    }
}
