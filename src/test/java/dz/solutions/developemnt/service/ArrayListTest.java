package dz.solutions.developemnt.service;

import dz.solutions.developemnt.service.WorkWithArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    static private List<String> users;

    @BeforeAll
    static public void initTest() {
        users = new ArrayList<>();
    }



    @Test
    @DisplayName("test is  empty")
    public void testIsEmpty() {
        assertTrue(users.isEmpty(), () -> "should be empty");
    }

    @Test
    @DisplayName("add element")
    public void testAddElement() {
        users.add("Mohammed");
        assertAll(() -> assertTrue(users.contains("Mohammed")), () ->assertEquals(users.size(), 1));
    }

    @Test
    @DisplayName("generate elements")
    public void testGenerateElements() {
        List<String> elements = WorkWithArrayList.generateElements(1000);
        assertEquals(elements.size(),1000);
    }

    @Test
    @DisplayName("test elements to string")
    public void testElementsToString() {
        List<String> elements = WorkWithArrayList.generateElements(1000);
        String result = WorkWithArrayList.elementsToString(elements);
        assertNotNull(result);
    }
}
