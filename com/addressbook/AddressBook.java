package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //initialising array list
    static ArrayList<AddressBookList> addressBookLists = new ArrayList<>();
    //taking scanner class for input from the user
    private static Scanner scanner = new Scanner(System.in);


    public void addContact() {
        if (addressBookLists.isEmpty()) {
            System.out.println("please enter the address book in which you want enter");
            return;
        } else {
            System.out.println("Enter the name of the address book in which you want to add add contact");
            String enterAddressBookNameToAddContact = scanner.next();

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
            //using streams and lambda functions
            if (duplicateCheckOfSamePersonInSameAddressBook(enterAddressBookNameToAddContact, firstName)) {
                addressBookLists.stream()
                        .filter(find -> find.addressBookName.contains(enterAddressBookNameToAddContact))
                        .forEach(addressBookList -> addressBookList.contacts.add(contact));
                System.out.println("Contact Added Successfully");
            } else {
                System.out.println("This Person is already in your Contact List");
            }
        }

    }

    //uc7 ability to check duplicate of same person in same adders book
    public boolean duplicateCheckOfSamePersonInSameAddressBook(String newAddressBookName, String firstName) {
        for (AddressBookList addressBookList : addressBookLists) {
            if (newAddressBookName.equals(addressBookList.getAddressBookName())) {
                for (Contact person : addressBookList.contacts) {
                    if (firstName.equals(person.getFirstName())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //edit existing contact
    public void editContact() {
        System.out.println("Enter the address book name in which you want to edit the contacts ");
        String enterNameOfAddressBookToEdit = scanner.next();
        System.out.println("Enter the First Name to edit ");
        String editFirstName = scanner.next();
        for (AddressBookList addressBookList : addressBookLists) {
            if (enterNameOfAddressBookToEdit.equals(addressBookList.addressBookName)) {
                for (Contact person : addressBookList.contacts) {
                    if (editFirstName.equalsIgnoreCase(person.getFirstName())) {

                        System.out.println("Enter the New First Name :- ");
                        String newFirstName = scanner.next();
                        person.setFirstName(newFirstName);

                        System.out.println("Enter the New Last Name :- ");
                        String newLastName = scanner.next();
                        person.setLastName(newLastName);

                        System.out.println("Enter the New Address :- ");
                        String newAddress = scanner.next();
                        person.setAddress(newAddress);

                        System.out.println("Enter the New City :- ");
                        String newCity = scanner.next();
                        person.setCity(newCity);

                        System.out.println("Enter the New State :- ");
                        String newState = scanner.next();
                        person.setState(newState);

                        System.out.println("Enter the New Zip Code :- ");
                        int newZip = scanner.nextInt();
                        person.setZip(newZip);

                        System.out.println("Enter the New Phone Number :- ");
                        long newPhoneNumber = scanner.nextLong();
                        person.setMobileNumber(newPhoneNumber);

                        System.out.println("Enter the New Email :- ");
                        String newEmail = scanner.next();
                        person.setEmail(newEmail);

                        System.out.println("Contact edited successfully ");
                        break;

                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
        }
    }


    //ability to delete a contact
    public void deleteContact() {
        System.out.println("Enter the name  of the address book in which you want to delete the contact");
        String enterNameOfAddressBookToDelete = scanner.next();
        System.out.println("Enter the First Name to delete ");
        String deleteName = scanner.next();

        for (AddressBookList addressBookList : addressBookLists) {
            if (enterNameOfAddressBookToDelete.equals(addressBookList.addressBookName)) {
                for (Contact person : addressBookList.contacts) {
                    if (deleteName.equals(person.getFirstName())) {
                        addressBookList.contacts.remove(person);
                        System.out.println("/n selected contact deleted successfully");
                        break;
                    } else {
                        continue;
                    }
                }
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

    //uc6 adding multiple address books
    public void newAddressBook() {
        System.out.println("Enter the name of the Address Book");
        String userInputBookName = scanner.next();

        if (!checkUnique(userInputBookName)) {
            System.out.println("You already have address book with the same name ");
            return;
        }
        AddressBookList addressBookListObject = new AddressBookList(userInputBookName);
        addressBookLists.add(addressBookListObject);

        System.out.println("New address book name is added to the list.");
    }

    //checking for unique address book to avoid duplicate names of address book
    public boolean checkUnique(String addressBookName) {
        if (addressBookLists.isEmpty()) {
            return true;
        }
        for (int i = 0; i < addressBookLists.size(); i++) {
            String getName = addressBookLists.get(i).addressBookName;
            if (getName.equals(addressBookName)) {
                return false;
            }
        }
        return true;
    }

    //display address book 
    public void displayAddressBook() {
        for (AddressBookList addressBook : addressBookLists) {
            System.out.println(addressBook);
        }
    }
}
