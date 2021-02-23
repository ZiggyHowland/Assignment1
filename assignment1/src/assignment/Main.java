package assignment;

import assignment.dependencies.Ui_fromScanner;

public class Main {


    public static void main(String[] args) {


        //Menu instanciateMenu = new Menu();
        //instanciateMenu.menu(new Ui_fromScanner());

        try {
            ReadClass readClass = new ReadClass();
            readClass.setFilnavn("assignment1/SalesRecords3.csv");
            //readClass.readEverything();
            readClass.printEverythingInObjects();
            //readClass.readOnlySpecificColumns();
        } catch (NullPointerException exception) {
            System.out.println("Not able to open file - wrong filename");
        }
    }
}
