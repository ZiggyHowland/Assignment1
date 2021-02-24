package assignment;

import fileConnection.FileConnection;

import java.io.BufferedReader;
import java.util.Scanner;

public class OpenFile {
    Scanner scanner = new Scanner(System.in);
    ReadClass readClass = new ReadClass();

    public void read() {
        try {
            ReadClass readClass = new ReadClass();
            readClass.setFilnavn("assignment1/SalesRecords2.csv");
            readClass.readEverything();
            readClass.printEverythingInObjects();
            readClass.readOnlySpecificColumns();
        } catch (NullPointerException exception) {
            System.out.println("Not able to open file - wrong filename");
        }
    }

    public void openFile() {
        try {
            System.out.println("Please enter filename:");
            String filnavn = scanner.nextLine();
            BufferedReader file = FileConnection.readConnection("assignment1/"+filnavn);
            System.out.println(filnavn + " file exists and is working");
        } catch (NullPointerException exception) {
            System.out.println("File doesn't exist");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
