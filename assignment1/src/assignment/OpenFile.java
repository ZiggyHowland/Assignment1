package assignment;

public class OpenFile {

        public void read() {
            try {
                ReadClass readClass = new ReadClass();
                readClass.setFilnavn("assignment1/SalesRecords3.csv");
                readClass.readEverything();
                readClass.printEverythingInObjects();
                readClass.readOnlySpecificColumns();
            } catch (NullPointerException exception) {
                System.out.println("Not able to open file - wrong filename");
            }
        }
}
