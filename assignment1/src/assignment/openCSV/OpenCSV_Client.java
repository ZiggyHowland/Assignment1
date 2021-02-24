package assignment.openCSV;

import assignment.OpenFile;
import assignment.openCSV.OpenCSV;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OpenCSV_Client {
    public static void main(String[] args) {
        String doMore = "yes";
        while (doMore.equals("Yes") || doMore.equals("yes")) {
        try {
                Scanner scanner = new Scanner(System.in);
                OpenCSV openCSV = new OpenCSV();
                OpenFile openFile = new OpenFile();

                final File f = new File("production/assignment1");
                OpenCSV_AvailableFiles.printAvailableFiles(f);

                System.out.println("\nWrite file you want to reach:");
                String filename = scanner.nextLine();
                openFile.openFile(filename);
                openFile.getFileInfo(filename);

                System.out.println("What do you want to do next?");
                System.out.println("1 - Read everything with OpenCSV\n2 - Write to file with OpenCSV");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) openCSV.readEverythingWithOpenCSV(filename);
                else if (choice == 2) openCSV.writeToFileWithStringsOpenCSV(filename);
                else System.out.println("Not a valid option");

                System.out.println("\nDo you want read again/add more? 'Yes/'No");
                doMore = scanner.nextLine();
            } catch(IOException e){
                System.out.println("Didn't work");
            }
        }
        System.out.println("Exiting program...");
    }
}
