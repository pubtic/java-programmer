package dz.solutions.developemnt.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    public void testArray() {
        int[] ages1 = new int[] {1, 2, 4, 3};
        int[] ages2 = {1, 2, 3, 4};
        Arrays.sort(ages1);
        assertArrayEquals(ages1, ages2);
    }

    @Test
    public void testArrayList() {
        List<Integer> ints = new ArrayList<>();
        List list1 = new ArrayList();
        list1.add("elements");
        int value = 1;
        list1.add(value);
        var list2 = new ArrayList();
        list2.add("elements");
        assertArrayEquals(list1.toArray(), list2.toArray());
    }
}
