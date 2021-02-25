package assignment;

import assignment.filesThatAreNotInUse.ReadClass;
import fileConnection.FileConnection;

import java.io.*;
import java.util.Scanner;

public class OpenFile {
    Scanner scanner = new Scanner(System.in);
    ReadClass readClass = new ReadClass();
    long lines = 0;
    private static final String filepath = "production/assignment1/";
    private static final String filepathExport = "production/export/";
    private static final String filepathDelete = "production/delete/";

    public static String getFilepath() {
        return filepath;
    }
    public static String getFilepathExport() {return filepathExport;}
    public static String getFilePathDelete() {return filepathDelete;}

    public long getLines() {
        return lines;
    }

    public void read(String filename) {
        try {
            ReadClass readClass = new ReadClass();
            //readClass.setFilnavn(filepath+"SalesRecords3.csv");
            readClass.readEverything(filename);
            //readClass.printEverythingInObjects();
            readClass.readOnlySpecificColumns();
        } catch (NullPointerException exception) {
            System.out.println("Not able to open file - wrong filename");
        }
    }

    public void openFile(String filename) throws IOException {

        try {
            BufferedReader file = FileConnection.readConnection(filepath + filename);
            System.out.println(filename + " file exists and is opened");
            getFileInfo(filename);
        } catch (NullPointerException exception) {
            throw new NullPointerException();
        } catch (FileNotFoundException exception) { //FileNotFoundException extends IOException
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new IOException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void OpenFileDeletePath(String filename) throws IOException {

        try {
            BufferedReader file = FileConnection.readConnection(filepathDelete + filename);
            System.out.println(filename + " file exists and is opened");
            getFileInfo(filename);
        } catch (NullPointerException exception) {
            throw new NullPointerException();
        } catch (FileNotFoundException exception) { //FileNotFoundException extends IOException
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new IOException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getFileInfo(String filename) throws IOException {
        //try {
            //System.out.println("Please enter filename:");
            //String filnavn = scanner.nextLine();
            BufferedReader file = FileConnection.readConnection(filepath + filename);
            int lines = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(filepath + filename))) {
                while (reader.readLine() != null) lines++;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Number of lines: " + lines + "\n");
        }
    }
