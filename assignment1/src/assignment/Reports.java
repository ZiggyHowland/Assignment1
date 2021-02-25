package assignment;

public class Reports {

    public static void RunReports(StoreData storedata){

        int size = storedata.sizeOfReport();
        double totaltSalg = 0;
        System.out.println("Salgsrapport");
        System.out.println("Totalt antall salg er " + size);
        for (int i = 0; i < size; i ++) {
            totaltSalg = totaltSalg + storedata.getItem(i).getTotalProfit();
        }
        System.out.println("Brutto inntekt er: " + totaltSalg);
    }
}
