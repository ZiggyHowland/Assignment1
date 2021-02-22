package assignment;

import SalgsRapportering.SalgsRapportering;

import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Konsturerer arrayobjekt som holder alle salg
        ArrayList<SalgsRapportering> alleSalg = new ArrayList<>();
        SalgsRapportering temp;

        ReadClass readClass = new ReadClass();
        readClass.setFilnavn("assignment1/SalesRecords2.csv");
        readClass.readEverything(alleSalg);
        readClass.printEverythingInObjects();

        //Make some simple test on
        temp = alleSalg.get(1);
        System.out.println(temp.getTotalCost());


    }
}
