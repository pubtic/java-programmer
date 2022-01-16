package dz.solutions.developemnt.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringAndStringBuilderTest {
    @Test
    public void testStringAndStringBuilder() {
        String string = "test";
        StringBuilder stringBuilder = new StringBuilder("test");
        assertTrue(string == stringBuilder.toString());
    }

    @Test
    public void testString() {
        String string1 = "test";
        String string2 = "test";
        String string3 = new String("test");
        assertTrue(string1 == string2);
        assertTrue(string1.equals(string3));
    }
}
