package Lab_1_1.tests;

import Lab_1_1.models.Client;

public class ClientTest {

    public void runTest() {
        Client client = new Client("name 1", "service 1", 400.3);
        System.out.println(client.think());
    }
}
