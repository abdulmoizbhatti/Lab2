/*
 * File Name: Pet.java
 * Assignment: Lab 2 Exercise D
 * Completed by: Moiz Bhatti
 * Submission Date: July 11th, 2024
 */


public class Pet {
    private String name;
    private String type;
    private Client owner;
    private CareProfile careProfile;

    public Pet(String name, String type, Client owner, CareProfile careProfile) {
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.careProfile = careProfile;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Client getOwner() {
        return owner;
    }

    public CareProfile getCareProfile() {
        return careProfile;
    }

    @Override
    public String toString() {
        return "Pet Name: " + name + "\nType: " + type + "\nOwner: " + owner.getName() + "\nCare Profile:\n" + careProfile;
    }
}
