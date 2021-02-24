package assignment;

public class Object {
    private String region;
    private String country;
    private String itemType;
    private String salesChannel;
    private String orderPriority;
    private String orderDate;
    private String orderID;
    private String shipDate;
    private int unitsSold;
    private double unitPrice;
    private double unitCost;
    private double totalRevenue;
    private double totalCost;
    private double totalProfit;

    public Object(String region, String country, String itemType, String salesChannel,
                  String orderPriority, String orderDate, String orderID, String shipDate, int unitsSold,
                  double unitPrice, double unitCost, double totalRevenue, double totalCost, double totalProfit) {
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

    public String getRegion() {
        return region;
    }

    public  double getTotalProfit(){
        return totalProfit;
    }

    @Override
    public String toString() {
        return "Object{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", itemType='" + itemType + '\'' +
                ", salesChannel='" + salesChannel + '\'' +
                ", orderPriority='" + orderPriority + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderID=" + orderID +
                ", shipDate='" + shipDate + '\'' +
                ", unitsSold=" + unitsSold +
                ", unitPrice=" + unitPrice +
                ", unitCost=" + unitCost +
                ", totalRevenue=" + totalRevenue +
                ", totalCost=" + totalCost +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
