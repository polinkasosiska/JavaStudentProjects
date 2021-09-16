package Lab_1_1.models;

public class PersonExceptionable {
    private int age;
    private double height;
    private String name;

    static final int MAX_AGE = 200;
    static final double MAX_HEIGHT = 3.2F;
    public PersonExceptionable() {}
    public void printInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age > MAX_AGE) throw new IllegalArgumentException("Lab_1_1.classes.Person is too old");
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height > MAX_HEIGHT) throw new IllegalArgumentException("Lab_1_1.classes.Person is too tall");
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
        return "Lab_1_1.classes.Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
