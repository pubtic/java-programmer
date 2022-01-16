package dz.solutions.developemnt;

public class Client {
    private static int clientNumber = 0;

    public Client() {
       clientNumber++;
    }

    public int getClientNumber() {
        return clientNumber;
    }
}
