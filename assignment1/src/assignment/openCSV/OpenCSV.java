package assignment.openCSV;

import assignment.OpenFile;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static assignment.OpenFile.getFilepath;

public class OpenCSV {
    Scanner scanner = new Scanner(System.in);
    List<String[]> therows = new ArrayList<>();
    //private final String filepath = "production/assignment1/";

    public static void readEverythingWithOpenCSV(String filename) {
        try {
            CSVReader reader = new CSVReader(new FileReader(getFilepath()+filename));
            String[] nextline;
            while ((nextline = reader.readNext()) != null) {
                System.out.println();
                if (nextline != null) {
                    System.out.println(Arrays.toString(nextline));
                }
            }
            System.out.println("CSV Read complete\n");
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void writeToFileWithStringsOpenCSV(String filename) {
        try {
            String oneMore = "Yes";
            CSVWriter writer = new CSVWriter(new FileWriter(getFilepath() + filename, true));
//            List<String[]> therows = new ArrayList<>();
            while (oneMore.equals("Yes") || oneMore.equals("yes")) {
                //System.out.println(getFilepath() + filename);
                System.out.println("Region:");
                String region = scanner.nextLine();
                System.out.println("Country:");
                String country = scanner.nextLine();
                System.out.println("Item type:");
                String itemType = scanner.nextLine();
                System.out.println("Sales channel:");
                String salesChannel = scanner.nextLine();
                System.out.println("Order priority:");
                String orderPriority = scanner.nextLine();
                System.out.println("Order date:");
                String orderDate = scanner.nextLine();
                System.out.println("Order ID:");
                String orderID = scanner.nextLine();
                System.out.println("Ship Date:");
                String shipDate = scanner.nextLine();
                System.out.println("Units sold:");
                String unitsSold = String.valueOf(scanner.nextLine());
                System.out.println("Unit Price:");
                String unitPrice = String.valueOf(scanner.nextLine());
                System.out.println("Unit Cost:");
                String unitCost = String.valueOf(scanner.nextLine());;
                System.out.println("Total Revenue:");
                String totalRevenue = String.valueOf(scanner.nextLine());;
                System.out.println("Total Cost:");
                String totalCost = String.valueOf(scanner.nextLine());;
                System.out.println("Total Profit:");
                String totalProfit = String.valueOf(scanner.nextLine());;

                //String[] header = new String[]{"Region", "Name", "OrderId", "Cost"};
                //therows.add(header);
                String[] row1 = new String[]{region+","+country+","+itemType+","+salesChannel+","+orderPriority+","+orderDate+"," +
                                            orderID+","+shipDate+","+unitsSold+","+unitPrice+","+unitPrice+","+unitCost+","+
                                            totalRevenue+","+totalCost+","+totalProfit};
                therows.add(row1);

                writer.writeAll(therows);

                System.out.println("Do you want to add one more row? 'Yes/No'");
                oneMore = scanner.nextLine();
            }
            writer.close();


        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addStringToExport(String stringToExportFile) {
            String[] row1 = new String[]{stringToExportFile};
            therows.add(row1);
    }

    public void exportChosenDataToFile(String filename){
        try{
            CSVWriter writer = new CSVWriter(new FileWriter(getFilepath() + filename, true));

            writer.writeAll(therows);
            writer.close();




    } catch (Exception e) {
        System.out.println(e);
    }
    }


         /* public void parserWithOpenCSV() {
            try {
                CSVParser csvParser = new CSVParser();
            } catch (Exception e) {
                System.out.println(e);
            }
         } */

}
