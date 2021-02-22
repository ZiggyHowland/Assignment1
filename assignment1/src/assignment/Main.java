package assignment;

public class Main {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        readClass.setFilnavn("assignment1/SalesRecords2.csv");
        readClass.readEverything();
        readClass.printEverythingInObjects();
        readClass.readOnlySpecificColumns();
    }
}
