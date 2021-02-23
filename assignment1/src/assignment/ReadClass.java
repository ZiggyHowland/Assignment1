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
            int teller = 0;
            StoreData storedata = new StoreData();
            while (line != null && teller < 5) {
                //Lage en eget metode for å håndtere dette?
                //REFAKTORISERE
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

                 //if(region.equals("Middle East and North Africa")) {
                    storedata.addObject(new Object(region, country, itemType, salesChannel, orderPriority,
                            orderDate, orderID, shipDate, unitsSold, unitPrice, unitCost,
                            totalRevenue, totalCost, totalProfit));
                //}
                teller++;
                line = file.readLine();
            }
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readOnlySpecificColumns() {
        objects.clear();
                try {
                    BufferedReader file = fileConnection.readConnection(filnavn);
                    String line = file.readLine();
                    int teller = 0;
                    double totalUnitCost = 0;
                    while (line != null && teller < 5) {
                        //REFAKTORISERE
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

                        totalUnitCost += unitCost;
                        teller++;
                        line = file.readLine();
                    }
                    System.out.println("Total unit costs is " + totalUnitCost);
                    file.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

    }

    public void printEverythingInObjects() {
        System.out.println();
        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }
}
