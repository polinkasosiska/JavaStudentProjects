package Pract_1_1.tests;

import Pract_1_1.models.Ball;

public class TestBall {

    public void runTest() {
        Ball ball = new Ball(0.2, 0.5);
        Ball ball1 = new Ball();
        System.out.println(ball.toString());
        System.out.println(ball1.toString());
    }
}
