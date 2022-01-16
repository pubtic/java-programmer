package dz.solutions.developemnt.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {
    @Test
    public void testIsEmpty() {
        List<String> elements = new ArrayList<String>();
        assertTrue(elements.isEmpty());
    }

    @Test
    public void testAddElement() {
        List<String> elements = new ArrayList<String>();
        elements.add("Mohammed");
        assertEquals(elements.size(), 1);
    }
}
