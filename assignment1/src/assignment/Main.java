package assignment;

import assignment.dependencies.Ui_fromScanner;

public class Main {


    public static void main(String[] args) {

        //Lager objekt "database"  for å holde på regneark som global variabel
        //og lager to dummy data linjer
        StoreData storedata = new StoreData();

        Object item1 = new Object("Europe", "Norway", "Bier", "online",
                "Høy", "230988", "14",
                "120221", 10, 15, 20, 300, 200, 100);
        Object item2 = new Object("Asia", "Japan", "knives", "Store",
                "Standard", "121212", "14",
                "120221", 10, 15, 20, 300, 200, 100);

        storedata.addObject(item1);
        storedata.addObject(item2);


        int size = storedata.sizeOfReport();
        System.out.println("size is " + size);

        Menu instanciateMenu = new Menu(new Ui_fromScanner());
        instanciateMenu.menu(storedata);
    }

}
