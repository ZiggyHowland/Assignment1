package assignment.openCSV;

import assignment.openCSV.OpenCSV;

import java.io.File;
import java.util.Scanner;

public class OpenCSV_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OpenCSV openCSV = new OpenCSV();
        final File f = new File("production/assignment1");
        String[] files = f.list();
        System.out.println("Available files:");
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

        System.out.println("\nWrite file you want to reach:");
        String filename = scanner.nextLine();
        openCSV.readEverythingWithOpenCSV(filename);
        openCSV.writeToFileWithStringsOpenCSV(filename);
        openCSV.readEverythingWithOpenCSV(filename);


    }
}
