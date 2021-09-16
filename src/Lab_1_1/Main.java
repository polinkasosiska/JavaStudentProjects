package Lab_1_1;
import Lab_1_1.models.Person;
import Lab_1_1.tests.ClientTest;
import Lab_1_1.tests.EmployeeTest;
import Lab_1_1.tests.PersonTest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        person.setName(in.next());
        person.setAge(in.nextInt());
        person.setHeight(in.nextInt());
        person.printInfo();
        new ClientTest().runTest();
        new EmployeeTest().runTest();
        new PersonTest().runTest();
    }
}
