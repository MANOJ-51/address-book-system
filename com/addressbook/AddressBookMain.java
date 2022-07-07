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
                System.out.println("6.to exit ");
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
                    default:
                        System.out.println("Enter valid choice from the list");
                }
                if (userChoice == 6) {
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
