package assignment;

public class Reports {

    public static void RunReports(StoreData storedata){

        int size = StoreData.sizeOfReport(storedata.objects);
        double totaltSalg = 0;
        System.out.println("Salgsrapport");
        System.out.println("Totalt antall salg er " + size);
        for (int i = 0; i < size; i ++) {
            totaltSalg = totaltSalg + storedata.getItem(i).getTotalProfit();
        }
        System.out.println("Brutto inntekt er: " + totaltSalg);
    }

    public static double sumTotalRevenue (StoreData sd){
        int size = StoreData.sizeOfReport(sd.objects);
        double totaltSalg = 0;
        for (int i = 0; i < size; i ++) {
            totaltSalg = totaltSalg + sd.getItem(i).getTotalProfit();
        }
        return totaltSalg;
    }

    public String highestGrossingRegion (StoreData sd) {

        String country = "";
        double sort = 0;
        int size = sd.getObjectsSize();
        for (int i = 0; i < size; i++) {
            if (sd.getItem(i).getTotalProfit() > sort) {
                country = sd.getItem(i).getRegion();
                sort = sd.getItem(i).getTotalProfit();
            }
        }
        return country;

    }
}
