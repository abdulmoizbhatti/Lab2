/*
 * File Name: YYCPetResort.java
 * Assignment: Lab 2 Exercise D
 * Completed by: Moiz Bhatti
 * Submission Date: July 11th, 2024
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YYCPetResort {
    private static List<Client> clients = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to YYC Pet Resort!");
            System.out.println("1. Add Client");
            System.out.println("2. Add Pet");
            System.out.println("3. View Clients");
            System.out.println("4. View Pets");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addClient(scanner);
                    break;
                case 2:
                    addPet(scanner);
                    break;
                case 3:
                    viewClients();
                    break;
                case 4:
                    viewPets();
                    break;
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addClient(Scanner scanner) {
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter client address: ");
        String address = scanner.nextLine();

        Client client = new Client(name, phoneNumber, address);
        clients.add(client);
        System.out.println("Client added successfully!");
        System.out.println(client); 
        System.out.println("Current number of clients: " + clients.size());
    }

    private static void addPet(Scanner scanner) {
        if (clients.isEmpty()) {
            System.out.println("No clients available. Please add a client first.");
            return;
        }

        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet type (cat/dog): ");
        String type = scanner.nextLine();

        System.out.println("Select pet owner:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ". " + clients.get(i).getName());
        }
        int ownerIndex = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (ownerIndex < 0 || ownerIndex >= clients.size()) {
            System.out.println("Invalid owner selected. Please try again.");
            return;
        }

        Client owner = clients.get(ownerIndex);

        System.out.print("Enter feeding instructions: ");
        String feedingInstructions = scanner.nextLine();
        System.out.print("Enter medication list: ");
        String medicationList = scanner.nextLine();
        System.out.print("Enter medication instructions: ");
        String medicationInstructions = scanner.nextLine();

        CareProfile careProfile = new CareProfile(feedingInstructions, medicationList, medicationInstructions);
        Pet pet = new Pet(name, type, owner, careProfile);
        pets.add(pet);
        System.out.println("Pet added successfully!");
        System.out.println(pet); 
        System.out.println("Current number of pets: " + pets.size());
    }

    private static void viewClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients available.");
            return;
        }

        for (Client client : clients) {
            System.out.println(client);
            System.out.println("-----");
        }
    }

    private static void viewPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets available.");
            return;
        }

        for (Pet pet : pets) {
            System.out.println(pet);
            System.out.println("-----");
        }
    }
}
