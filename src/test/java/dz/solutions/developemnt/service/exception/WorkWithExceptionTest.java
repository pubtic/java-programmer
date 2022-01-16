package dz.solutions.developemnt.service.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class WorkWithExceptionTest {

    @Test
    public void testSetUsers() throws MaximumUserException {
        WorkWithException workWithException = new WorkWithException();
        assertThrows(MaximumUserException.class, () -> workWithException.setUsers(100));
    }

    @Test
    @DisplayName("test read file exception")
    public void testReadFile() {
        WorkWithException workWithException = new WorkWithException();
        assertThrows(FileNotFoundException.class, () -> workWithException.readFile("aaaaa"));
    }
}
