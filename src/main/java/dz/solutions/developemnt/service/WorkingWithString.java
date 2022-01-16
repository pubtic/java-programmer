package dz.solutions.developemnt.service;

public class WorkingWithString {

    static String originalPassword = "123456789";

    static Boolean checkPassword(String password) {
        return originalPassword == password;
    }

}
