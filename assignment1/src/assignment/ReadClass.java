package assignment;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import SalgsRapportering.SalgsRapportering;
import fileConnection.FileConnection;

public class ReadClass {
    ArrayList<Object> objects = new ArrayList<>();
    //TODO

    private String filnavn;
    public void setFilnavn(String filnavn) {
        this.filnavn = filnavn;
    }

    public void readEverything(ArrayList<SalgsRapportering> salg) {
         //TODO
        objects.clear();
        SalgsRapportering tempSalg;
        try {
            BufferedReader file = FileConnection.readConnection(filnavn);
            String line = file.readLine();
            int teller = 0;
            while (line != null && teller < 20) {
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

                if(region.equals("Middle East and North Africa")) {
                    objects.add(new Object(region, country, itemType, salesChannel, orderPriority,
                            orderDate, orderID, shipDate, unitsSold, unitPrice, unitCost,
                            totalRevenue, totalCost, totalProfit));
                    tempSalg = new SalgsRapportering(region, country, itemType, salesChannel, orderPriority,
                            orderDate, orderID, shipDate, unitsSold, unitPrice, unitCost,
                            totalRevenue, totalCost, totalProfit);
                    salg.add(tempSalg);
                }

                teller++;
                System.out.println(region);
                System.out.println(file.readLine());
            }
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printEverythingInObjects() {
        for (Object o : objects) {
            System.out.println(o.toString());
            break;
        }
    }
}
