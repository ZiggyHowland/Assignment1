package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import fileConnection.FileConnection;

public class ReadClass {
    //ArrayList<Object> objects = new ArrayList<>();
    private String filnavn;
    StoreData storedata = new StoreData();

    public void readEverything(String filename) {
        //objects.clear();
        try {
            BufferedReader file = FileConnection.readConnection(filename);
            String line = file.readLine();
            int teller = 0;
            while (line != null && teller < 5) {
                StringTokenizer contents = new StringTokenizer(line, ",");
                String region = contents.nextToken();
                String country = contents.nextToken();
                String itemType = contents.nextToken();
                String salesChannel = contents.nextToken();
                String orderPriority = contents.nextToken();
                String orderDate = contents.nextToken();
                String orderId = contents.nextToken();
                String shipDate = contents.nextToken();
                int unitsSold = Integer.parseInt(contents.nextToken());
                double unitPrice = Double.parseDouble(contents.nextToken());
                double unitCost = Double.parseDouble(contents.nextToken());
                double totalRevenue = Double.parseDouble(contents.nextToken());
                double totalCost = Double.parseDouble(contents.nextToken());
                double totalProfit = Double.parseDouble(contents.nextToken());

                //if(region.equals("Middle East and North Africa")) {
                storedata.addObject(new Object(region, country, itemType, salesChannel, orderPriority,
                        orderDate, orderId, shipDate, unitsSold, unitPrice, unitCost,
                        totalRevenue, totalCost, totalProfit));
                //}
                teller++;
                line = file.readLine();
            }
            file.close();
        } catch (NullPointerException exception) {
            throw new NullPointerException();
            //System.out.println(exception);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void countRows() {
        //todo
    }

    public void readOnlySpecificColumns() {
        //objects.clear();
                try {
                    BufferedReader file = FileConnection.readConnection(filnavn);
                    String line = file.readLine();
                    int teller = 0;
                    double totalUnitCost = 0;
                    while (line != null && teller < 5) {
                        //REFAKTORISERE
                        double unitCost = getUnitCost(line);

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

    private double getUnitCost(String line) {
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
        return unitCost;
    }

    //For eksempel Rapport-klasse
    /* public void printEverythingInObjects() {
        System.out.println();
        for (Object o : objects) {
            System.out.println(o.toString());
        }
    } */
}
