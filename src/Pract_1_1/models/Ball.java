package Pract_1_1.models;

public class Ball {

    private double weight;
    private double radius;

    public Ball(double weight, double radius) {
        this.weight = weight;
        this.radius = radius;
    }

    public Ball() {
        weight = 0.4;
        radius = 0.68;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "weight: " + weight + ", radius: " + radius;
    }
}
