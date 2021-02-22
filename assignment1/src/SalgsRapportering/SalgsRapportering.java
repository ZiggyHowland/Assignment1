package SalgsRapportering;

import java.util.Date;
import java.lang.*;

//TODO . make into superclass later

public class SalgsRapportering {
    private String region;
    private String country;
    private String itemType;
    private String salesChannel;
    private String orderPriority;
    private String orderDate;
    private int orderID;
    private String shipDate;
    // Todo: Make this part into separate "financial" class later
    int unitsSold;
    double unitPrice;
    double unitCost;
    double totalRevenue;
    double totalCost;
    double totalProfit;


    //public SalgsRapportering() {
     //   System.out.println("heisann1");
    //}


    public SalgsRapportering(String region, String country, String itemType, String salesChannel,
                             String orderPriority, String orderDate, int orderID, String shipDate,
                             int unitsSold, double unitPrice, double unitCost, double totalRevenue,
                             double totalCost, double totalProfit) {
        this.region = region;
        this.country = country;
        this.itemType = itemType;
        this.salesChannel = salesChannel;
        this.orderPriority = orderPriority;
        this.orderDate = orderDate;
        this.orderID = orderID;
        this.shipDate = shipDate;
        this.unitsSold = unitsSold;
        this.unitPrice = unitPrice;
        this.unitCost = unitCost;
        this.totalRevenue = totalRevenue;
        this.totalCost = totalCost;
        this.totalProfit = totalProfit;
    }


    //Making some simple getters for test purposes:


    public double getTotalRevenue() {
        return totalRevenue;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
