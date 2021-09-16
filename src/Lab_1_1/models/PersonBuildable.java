package Lab_1_1.models;

import Lab_1_1.helpers.GenderEnum;

public class PersonBuildable {
    private int age;
    private double height;
    private String name;
    private GenderEnum gender;

    public PersonBuildable(int age, double height, String name, GenderEnum gender) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age > Person.MAX_AGE) throw new IllegalArgumentException("Lab_1_1.classes.Person is too old");
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height > Person.MAX_HEIGHT) throw new IllegalArgumentException("Lab_1_1.classes.Person is to tall");
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
        return "Lab_1_1.classes.PersonBuildable{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", gender=" + gender.getGender() +
                '}';
    }

    public class Builder {

    }
}
