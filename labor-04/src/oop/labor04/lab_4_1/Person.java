package oop.labor04.lab_4_1;

public class Person{
    private final String firstName;
    private String lastName;
    private final int birthYear;

    // constructor
    public Person(String lastName, String firstName, int birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // toString()
    @Override
    public String toString() {
        return firstName + " " + lastName + " - born in: " + birthYear;
    }

    // reading from .txt file

}
