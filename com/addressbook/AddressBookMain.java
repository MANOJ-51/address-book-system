package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        //main method
        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM ");

        Scanner scanner = new Scanner(System.in);
        AddressBook object = new AddressBook();

        System.out.println("Enter valid option [1.Enter or 2.Exit] ");
        int enterExit = scanner.nextInt();

        if (enterExit == 1) {
            while (enterExit != 2) {
                System.out.println("Choose The operation to perform from below list");
                System.out.println("1.to add new address book");
                System.out.println("2.to add contact");
                System.out.println("3.to edit contact");
                System.out.println("4.to delete contact");
                System.out.println("5.to display address book ");
                System.out.println("6.to search persons in same city ");
                System.out.println("7.to search persons in same state ");
                System.out.println("8.to view contacts in city  ");
                System.out.println("9.to View contacts in state ");
                System.out.println("10.to view count of total contacts in city ");
                System.out.println("11.to view count of total contacts in state ");
                System.out.println("12.to view sorted contacts by name city state zip ");
                System.out.println("13.to exit  ");

                System.out.println("ENTER THE VALUE OF YOUR CHOICE");
                int userChoice = scanner.nextInt();

                switch (userChoice) {
                    case 1:
                        object.newAddressBook();
                        break;
                    case 2:
                        object.addContact();
                        break;
                    case 3:
                        object.editContact();
                        break;
                    case 4:
                        object.deleteContact();
                        break;
                    case 5:
                        object.displayAddressBook();
                        break;
                    case 6:
                        object.searchPersonsBYCity();
                        break;
                    case 7:
                        object.searchPersonsByState();
                        break;
                    case 8:
                        object.viewContactsInCity();
                        break;
                    case 9:
                        object.viewContactsInState();
                        break;
                    case 10:
                        object.numberOfContactsInCity();
                        break;
                    case 11:
                        object.numberOfContactsInState();
                        break;
                    case 12:
                        object.sortByNameCityStateZip();
                        break;
                    default:
                        System.out.println("Enter valid choice from the list");
                }
                if (userChoice == 13) {
                    System.out.println("Successfully exited");
                    break;
                }

            }
        } else if (enterExit == 2) {
            System.out.println("Successfully exited from address book");
        } else {
            System.out.println("Choose valid option");
        }
        scanner.close();
    }
}
