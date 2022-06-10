package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //initialisiging array list
    static ArrayList<Contact> contacts = new ArrayList<Contact>();
    //taking scanner class for input from the user
    private static Scanner scanner = new Scanner(System.in);


    public void addContact() {
        System.out.println("Enter the First Name :- ");
        String firstName = scanner.next();

        System.out.println("Enter the Last Name :- ");
        String lastName = scanner.next();

        System.out.println("Enter the Address :- ");
        String address = scanner.next();

        System.out.println("Enter the City :- ");
        String city = scanner.next();

        System.out.println("Enter the State :- ");
        String state = scanner.next();

        System.out.println("Enter the Zip Code :- ");
        int zip = scanner.nextInt();

        System.out.println("Enter the Phone Number :- ");
        long phoneNumber = scanner.nextLong();

        System.out.println("Enter the Email :- ");
        String email = scanner.next();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(contact);

        System.out.println("Contact Added Successfully");


    }

    //edit existing contact
    public void editContact() {
        System.out.println("Enter the First Name to edit ");
        String firstName = scanner.next();
        for (Contact person : contacts) {
            if (firstName.equals(person.getFirstName())) {
                System.out.println("Enter the New First Name :- ");
                String newFirstName = scanner.next();

                System.out.println("Enter the New Last Name :- ");
                String newLastName = scanner.next();

                System.out.println("Enter the New Address :- ");
                String newAddress = scanner.next();

                System.out.println("Enter the New City :- ");
                String newCity = scanner.next();

                System.out.println("Enter the New State :- ");
                String newState = scanner.next();

                System.out.println("Enter the New Zip Code :- ");
                int newZip = scanner.nextInt();

                System.out.println("Enter the New Phone Number :- ");
                long newPhoneNumber = scanner.nextLong();

                System.out.println("Enter the New Email :- ");
                String newEmail = scanner.next();

                Contact contact3 = new Contact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);
                contacts.add(contact3);

                System.out.println("Contact edited Successfully");
                break;
            } else {
                continue;
            }
        }

    }

    //ability to delete a contact
    public void deleteContact() {
        System.out.println("Enter the First Name to delete ");
        String deleteName = scanner.next();
        for (int i = 0; i <= contacts.size(); i++) {
            String findingName = contacts.get(i).getFirstName();
            if (deleteName.equals(findingName)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully");
                break;
            } else {
                continue;
            }
        }

    }

    //ability to add multiple persons
    public void multiplePersons() {
        System.out.println("Enter the number of contacts to be created");
        int userWant = scanner.nextInt();
        for (int i = 0; i < userWant; i++) {
            addContact();
        }
    }

}
