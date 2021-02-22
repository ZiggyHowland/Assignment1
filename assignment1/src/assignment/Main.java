package assignment;

public class Main {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        readClass.setFilnavn("SalesRecords.csv");
        readClass.readEverything();
        readClass.printEverythingInObjects();
    }
}
