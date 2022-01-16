package dz.solutions.developemnt.service.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WorkWithException {
    private static final Integer MAX_USERS = 10;
    private Integer users;

    public Integer getUsers() {
        return users;
    }

    public  void setUsers(Integer users) throws MaximumUserException {
        if (users <= MAX_USERS) {
            this.users = users;
        } else {
            throw new MaximumUserException("Maximum user Exception");
        }
    }

    public void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
