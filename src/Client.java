/*
 * File Name: Client.java
 * Assignment: Lab 2 Exercise D
 * Completed by: Moiz Bhatti
 * Submission Date: July 11th, 2024
 */


public class Client {
    private String name;
    private String phoneNumber;
    private String address;

    public Client(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Client Name: " + name + "\nPhone Number: " + phoneNumber + "\nAddress: " + address;
    }
}
