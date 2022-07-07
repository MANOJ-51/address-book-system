package com.addressbook;

import java.util.ArrayList;

public class AddressBookList {
    public String addressBookName;
    public ArrayList<Contact> contacts;

    //creating constructor it says that address book  has a name and some contacts
    public AddressBookList(String addressBookName) {
        this.addressBookName = addressBookName;
        this.contacts = new ArrayList<Contact>();
    }
    //getters and setters of book name

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    //to string print method

    @Override
    public String toString() {
        return "AddressBookList{" +
                "addressBookName='" + addressBookName + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
