package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //initialisiging array list
    static ArrayList<Contact> contacts = new ArrayList<Contact>();
    //taking scanner class for input from the user
    private static Scanner scanner = new Scanner(System.in);

    //DISPLAYING WELCOME MESSAGE
    public static void main(String[] args) {
        System.out.println("WELOCOME TO ADRESS BOOK SYSTEM ");
        Contact contact = addContact();
        System.out.println(contact);
        Contact contact1 = editContact(contact);
        System.out.println(contact1);
    }

    private static Contact addContact() {
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
        return contact;

    }

    //edit existing contact
    private static Contact editContact(Contact contact) {
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
            }
        }
        return contact;
    }


}
