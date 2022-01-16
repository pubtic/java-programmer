package dz.solutions.dvelopemnt.factory;

import java.util.LinkedList;
import java.util.List;

public class Duck implements IAnimal{
    @Override
    public void speak() {
        System.out.println("Duck voice");
    }
}
