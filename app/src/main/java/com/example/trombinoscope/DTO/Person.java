package com.example.trombinoscope.DTO;

public class Person {
    private String firstName;
    private String lastName;
    private int avatarColor;

    public Person(String firstName, String lastName, int avatarColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatarColor = avatarColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAvatarColor() {
        return avatarColor;
    }

    public void setAvatarColor(int avatarColor) {
        this.avatarColor = avatarColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avatarColor=" + avatarColor +
                '}';
    }

}
