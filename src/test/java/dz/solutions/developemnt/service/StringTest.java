package dz.solutions.developemnt.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {

    @Test
    public void testCheckPasswordTrue() {
        assertTrue(WorkingWithString.checkPassword("123456789"));
    }

    @Test
    public void testCheckPasswordFalse() {
        assertFalse(WorkingWithString.checkPassword(new String("123456789")));
    }
}
