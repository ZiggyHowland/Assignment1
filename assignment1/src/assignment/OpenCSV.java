package assignment;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpenCSV {
    public void readEverythingWithOpenCSV(String filename) {
        try {
            CSVReader reader = new CSVReader(new FileReader("assignment1/"+filename));
            String[] nextline;
            while ((nextline = reader.readNext()) != null) {
                if (nextline != null) {
                    System.out.println(Arrays.toString(nextline));
                }
            }
            System.out.println("CSV Read complete");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void writeToFileWithStringsOpenCSV(String filename) {
        try {
            String youtube = "https://www.youtube.com/watch?v=sgGGjisdNPA&ab_channel=MikeM%C3%B8llerNielsen";
            System.out.println("assignment1/"+filename.concat(".csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("assignment1/"+filename.concat(".csv"), true));
            List<String[]> therows = new ArrayList<>();
            String[] header = new String[]{"Region", "Name", "OrderId", "Cost"};
            therows.add(header);
            String[] row1 = new String[]{"Europe", "Hans","233333", "205.90"};
            String[] row2 = new String[]{"Asia", "Fredrik","2333367", "255.11"};
            String[] row3 = new String[]{"Another region", "Another name","Another orderId", "Another Cost"};
            therows.add(row1);
            therows.add(row2);
            therows.add(row3);

            writer.writeAll(therows); //OBS! WriteAll appender ikke, men sletter nåværende innhold og legger inn linjene over
            //writer.writeNext(row1);
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /* public void writeToFileWithObjectsOpenCSV(String filename) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("assignment1/"+filename));
            List<Object> objects = new ArrayList<>();

            String region = contents.nextToken();
            String country = contents.nextToken();
            String itemType = contents.nextToken();
            String salesChannel = contents.nextToken();
            String orderPriority = contents.nextToken();
            String orderDate = contents.nextToken();
            int orderID = Integer.parseInt(contents.nextToken());
            String shipDate = contents.nextToken();
            int unitsSold = Integer.parseInt(contents.nextToken());
            double unitPrice = Double.parseDouble(contents.nextToken());
            double unitCost = Double.parseDouble(contents.nextToken());
            double totalRevenue = Double.parseDouble(contents.nextToken());
            double totalCost = Double.parseDouble(contents.nextToken());
            double totalProfit = Double.parseDouble(contents.nextToken());

            objects.add(new Object(region, country, itemType, salesChannel, orderPriority,
                    orderDate, orderID, shipDate, unitsSold, unitPrice, unitCost,
                    totalRevenue, totalCost, totalProfit));

            writer.writeAll(objects);
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    } */


        public void parserWithOpenCSV() {
            try {
                CSVParser csvParser = new CSVParser();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
