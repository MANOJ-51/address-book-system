package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //DISPLAYING WELCOME MESSAGE
    public static void main(String[] args) {
        System.out.println("WELOCOME TO ADRESS BOOK SYSTEM ");
        Contact contact=addContact();
        System.out.println(contact);
    }

    //taking scanner class for input from the user
    private static Scanner scanner = new Scanner(System.in);

    //initialisigin array list
    static ArrayList<Contact> contacts = new ArrayList<Contact>();

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
        int zip= scanner.nextInt();

        System.out.println("Enter the Phone Number :- ");
        long phoneNumber = scanner.nextLong();

        System.out.println("Enter the Email :- ");
        String email = scanner.next();

        Contact contact=new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        contacts.add(contact);

        System.out.println("Contact Added Successfully");
        return contact;

    }


    }
