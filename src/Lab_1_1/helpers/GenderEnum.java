package Lab_1_1.helpers;

public enum GenderEnum {

    MALE(1, "Male"),
    FEMALE(2, "Female"),
    OTHER(1023, "Other");

    private final int id;
    private final String gender;

    private GenderEnum(int i, String gender) {
        id = i;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ID " + id + ": " + gender;
    }
}
