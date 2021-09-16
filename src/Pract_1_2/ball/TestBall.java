package Pract_1_2.ball;

public class TestBall {

    public void runTest() {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
