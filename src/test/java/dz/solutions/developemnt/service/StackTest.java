package dz.solutions.developemnt.service;

import dz.solutions.developemnt.service.WorkWithStack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    @DisplayName("stack is empty")
    public void testIsEmpty() {
        Stack<String> elements = WorkWithStack.elements();
        assertTrue(elements.isEmpty());
    }

}
