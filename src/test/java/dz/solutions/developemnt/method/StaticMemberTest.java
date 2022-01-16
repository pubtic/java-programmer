package dz.solutions.developemnt.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StaticMemberTest {

    @Test
    public void testStaticMember() {
        StaticMember staticMember = new StaticMember();
        assertNotNull(StaticMember.count);
    }
}
