package Pract_1_1;

import Pract_1_1.tests.TestBall;
import Pract_1_1.tests.TestBook;
import Pract_1_1.tests.TestDog;

public class Main {

    public static void main(String[] args) {
        new TestDog().runTest();
        new TestBall().runTest();
        new TestBook().runTest();
    }
}
