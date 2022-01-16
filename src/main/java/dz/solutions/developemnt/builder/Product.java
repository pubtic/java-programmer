package dz.solutions.developemnt.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private List<String> parts = new LinkedList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
