package dz.solutions.developemnt.thread;

public class Robot implements Runnable {

    public Robot(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public void run() {
        for (var i = 0; i < 10; i++) {
            System.out.println(name + i);
        }
    }
}
