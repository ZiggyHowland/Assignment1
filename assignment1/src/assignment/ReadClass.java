package assignment;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import fileConnection.fileConnection;

public class ReadClass {
    ArrayList<Object> objects = new ArrayList<>();
    private String filnavn;

    public void setFilnavn(String filnavn) {
        this.filnavn = filnavn;
    }

    public void readEverything() {
        objects.clear();
        try {
            BufferedReader file = fileConnection.readConnection(filnavn);
            String line = file.readLine();
            while (line != null) {
                StringTokenizer contents = new StringTokenizer(line, ",");
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
            }
        } catch (Exception e) {
            System.out.println("e");
        }
    }

    public void printEverythingInObjects() {
        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }
}
