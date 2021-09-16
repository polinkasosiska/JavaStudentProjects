package Lab_1_1.tests;

import Lab_1_1.models.Person;

public class PersonTest {

    public void runTest() {
        Person person = new Person(0, 0, "");
        person.setAge(Person.MAX_AGE + 1);
        person.setHeight(Person.MAX_HEIGHT + 1);
        person.setName("");
    }
}
