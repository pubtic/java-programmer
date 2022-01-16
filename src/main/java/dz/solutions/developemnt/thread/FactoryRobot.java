package dz.solutions.developemnt.thread;

public class FactoryRobot implements Runnable {
    private String name;

    public FactoryRobot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (var i = 0; i < 10; i++) {
            System.out.println(name + i);
        }
    }

}
