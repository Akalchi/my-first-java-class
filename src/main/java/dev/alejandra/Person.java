package dev.alejandra;

public class Person {

    private String name;
    private String Id;
    
    // Constructor
    public Person(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    
    // Getters
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.Id;
    }
}
