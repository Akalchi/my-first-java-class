package dev.alejandra;

public class Person {

    private String name;
    private String Id;
    private int yearOfBirth;    
    
    // Constructor
    public Person(String name, String Id, int yearOfBirth) {
        this.name = name;
        this.Id = Id;
        this.yearOfBirth = yearOfBirth;
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
}
