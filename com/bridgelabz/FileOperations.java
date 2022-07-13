package com.bridgelabz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    //uc13 file operations
    //writing contacts into the txt file
    public void writeContactsIntoTextFile() throws Exception {
        //fileWriter method
        FileWriter fileWriter = new FileWriter("src/ContactsData.txt");
        String addressBookString = AddressBook.addressBookLists.toString();

        for (int i = 0; i < addressBookString.length(); i++) {
            fileWriter.write(addressBookString.charAt(i));
        }
        fileWriter.close();
        System.out.println("Data added into ContactsData.txt file \n");
    }

    //reading contacts from the text file
    public void readContactsFromTheTextFile() throws Exception {
        //checking the existence of file by using path
        Path path = Paths.get("src/ContactsData.txt");
        if (!Files.exists(path)) {
            System.out.println("The file doesn't exist . Creating a new file ...");
            writeContactsIntoTextFile();
        }

        //fileInputStream method to read the data in written file
        FileInputStream fileInputStream = new FileInputStream("src/ContactsData.txt");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}
