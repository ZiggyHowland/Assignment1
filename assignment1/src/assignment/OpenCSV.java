package assignment;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class OpenCSV {
    public static void main(String[] args) {
        try {
            CSVReader reader = new CSVReader(new FileReader("assignment1/SalesRecords2.csv"));
            String[] nextline;
            while ((nextline = reader.readNext()) != null) {
                if (nextline != null) {
                    System.out.println(Arrays.toString(nextline));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("CSV Read complete");
    }
}
