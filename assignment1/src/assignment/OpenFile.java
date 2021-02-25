package assignment;

import fileConnection.FileConnection;

import java.io.*;
import java.util.Scanner;

public class OpenFile {
    Scanner scanner = new Scanner(System.in);
    ReadClass readClass = new ReadClass();
    long lines = 0;
    private static final String filepath = "production/assignment1/";

    public static String getFilepath() {
        return filepath;
    }

    public long getLines() {
        return lines;
    }

    public void read(String filename) {
        try {
            ReadClass readClass = new ReadClass();
            //readClass.setFilnavn(filepath+"SalesRecords3.csv");
            //readClass.readEverything(filename);
            //readClass.printEverythingInObjects();
            readClass.readOnlySpecificColumns();
        } catch (NullPointerException exception) {
            System.out.println("Not able to open file - wrong filename");
        }
    }

    public String openFile(String filename){

        try {
            BufferedReader file = FileConnection.readConnection(filepath + filename);
            System.out.println(filename + " file exists and is opened");
            getFileInfo(filename);
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        } catch (FileNotFoundException exception) { //FileNotFoundException extends IOException
            System.out.println("File doesn't exist");
            scanner.next();
            return ("File doesn't exist");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void getFileInfo(String filename) throws IOException {
        //try {
        //System.out.println("Please enter filename:");
        //String filnavn = scanner.nextLine();
        BufferedReader file = FileConnection.readConnection(filepath + filename);



        try (BufferedReader reader = new BufferedReader(new FileReader(filepath + filename))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of lines: " + lines + "\n");
    }
}