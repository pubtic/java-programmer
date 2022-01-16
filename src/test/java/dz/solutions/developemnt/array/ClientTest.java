package dz.solutions.developemnt.array;

import dz.solutions.developemnt.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    public void testClientNumber() {
        Client client1 = new Client();
        Client client2 = new Client();
        assertEquals(1, client2.getClientNumber());

    }
}
