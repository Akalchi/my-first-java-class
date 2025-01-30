package dev.alejandra;

public class Person {

    private String name;
    private String Id;
    private int yearOfBirth;    
    private String Surname;
    
    // Constructor
    public Person(String name, String Id, int yearOfBirth, String Surname) {
        this.name = name;
        this.Id = Id;
        this.yearOfBirth = yearOfBirth;
        this.Surname = Surname;
    }


    // Getters
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.Id;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public String getSurname() {
        return this.Surname;
    }
}
