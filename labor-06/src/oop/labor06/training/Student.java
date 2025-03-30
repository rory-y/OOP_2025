package oop.labor06.training;

public class Student {
    private final String ID;
    private String firstName;
    private final String lastName;

    // constructor

    public Student(String ID, String lastName, String firstName) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // getters

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    // setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // toString

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n\t ID: " + ID + "\n";
    }
}
