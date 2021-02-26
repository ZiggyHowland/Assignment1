package assignment.filesThatAreNotInUse.InternalTesting;

public class TestDB {

    public  static void TestDB() {
        System.out.println("Start testing");


        LineItem no1 = new LineItem(10, 10, 100);
        LineItem no2 = new LineItem(100, 10, 100);
        LineItem no3 = new LineItem(1000, 10, 100);
        LineItem no4 = new LineItem(10000, 10, 100);

        int pris = no1.getPris();
        System.out.println("Pris " + pris);

        AllItems database = new AllItems();

        database.setItem(no1);
        database.setItem(no2);
        database.setItem(no3);
        database.setItem(no4);


        System.out.println(database.getItem(0).getPris());
        System.out.println(database.getItem(3).getPris());


        int size = database.sizeOfDB();
        System.out.println("Størrelse på DB er " + size);
        int sum = 0;
        for (int i = 0; i < size; i ++){
            sum = sum + database.getItem(i).getPris();
        }

        System.out.println("Summen er " + sum);
    }
}
