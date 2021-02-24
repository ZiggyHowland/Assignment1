package assignment;

import java.util.Scanner;

public class OpenCSV_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OpenCSV openCSV = new OpenCSV();
        System.out.println("Filename:");
        String filename = scanner.nextLine();
        openCSV.readEverythingWithOpenCSV(filename);
        openCSV.writeToFileWithStringsOpenCSV(filename);
        openCSV.readEverythingWithOpenCSV(filename);


    }
}
