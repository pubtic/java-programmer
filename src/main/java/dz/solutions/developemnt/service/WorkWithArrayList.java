package dz.solutions.developemnt.service;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkWithArrayList {

    public List<String> elements() {
        return Collections.emptyList();
    }
    static public List<String> generateElements(Integer size) {

        List<String> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(RandomStringUtils.randomAlphabetic(10));
        }
        return elements;
    }

    static public String elementsToString(List<String> elements) {
        StringBuilder result = new StringBuilder();
        for (String element : elements) {
            result.append(element);
        }
        return result.toString();
    }
}
