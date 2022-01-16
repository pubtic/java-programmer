package dz.solutions.developemnt.stream;

import dz.solutions.developemnt.model.Product;

import java.util.List;
import java.util.stream.Stream;

public class WorkWithStream {

    public static Stream<String> createEmptyStream() {
        return Stream.empty();
    }

    public static Stream<Integer> createSingleElementStream() {
        return Stream.of(1);
    }

    public static Stream<Integer> createArrayStream() {
        return Stream.of(new Integer[]{1, 2, 3});
    }

    public static Stream<String> createListStream() {
        var list = List.of("a", "b", "c");
        return list.stream();
    }

    public static Stream<String> createParallelStream() {
        var list = List.of("a", "b", "c");
        return list.parallelStream();
    }

    public static void streamOperations() {
        var count = createArrayStream().count();
        var min = createArrayStream().max((i1, i2) -> i1 - i2);
    }


    public static Integer getMax(List<Integer> elements) {
        return elements.stream().max((e1, e2) -> {
            return e1 - e2;
        }).orElseThrow();
    }


    public static Integer getMin(List<Integer> elements) {
        return elements.stream().min((e1, e2) -> {
            return e1 - e2;
        }).orElseThrow();
    }

    public static String getMaxString(List<String> elements) {
        return elements.stream().max((e1, e2) -> {
            return e1.length() - e2.length();
        }).orElseThrow();
    }

    public static String getMinString(List<String> elements) {
        return null;
    }


    public static Product getMaxPriceProduct(List<Product> products) {
        return products.stream().max((p1, p2) -> {
            return p1.getPrice() - p2.getPrice();
        }).orElseThrow();
    }

}
