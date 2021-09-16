package Lab_1_1.models;


import Lab_1_1.HumanInterface;

public abstract class AbstractPerson implements HumanInterface {

    String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String think();
}
