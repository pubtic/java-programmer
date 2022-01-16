package dz.solutions.developemnt.thread;

public class Car extends Thread{

    public  static Integer counter = 0;
    private String name;

    public Car(String name) {
        counter++;
        this.name = name;
    }

    @Override
    public void run() {
        for(var i = 0; i <=10; i++) {
            System.out.println(name + i);
        }
    }

}
