package Lab_1_1.models;

public class Person {

    private int age;
    private double height;
    private String name;

    private boolean valid = true;

    public static final int MAX_AGE = 200;
    public static final double MAX_HEIGHT = 3.2F;

    public Person() {
    }

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public boolean isValid() {
        return valid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age > MAX_AGE) throw new IllegalArgumentException("Person is too old");
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height > MAX_HEIGHT) throw new IllegalArgumentException("Person is too tall");
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}