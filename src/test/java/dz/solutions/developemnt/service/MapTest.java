package dz.solutions.developemnt.service;

import dz.solutions.developemnt.service.WorkWithMap;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {

    @Test
    public void testIsEmpty() {
        Map<Integer, String> elements = WorkWithMap.elements();
        elements.put(1, "Mohammed");
        assertTrue(elements.isEmpty());
    }
}
