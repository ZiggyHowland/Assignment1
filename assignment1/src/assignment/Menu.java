package assignment;
import assignment.dependencies.Ui;
import assignment.dependencies.Ui_fromScanner;

public class Menu {
    private Ui Ui;

    public void menu(Ui ui_fromScanner){
        this.Ui = ui_fromScanner;

        //test input from user
        System.out.println("write something:");
        String input = Ui.inputStringFromUser();

        System.out.println(input);
        int menuSelect;
        boolean quit = false;
        do{
            System.out.println("select 1-3");
            menuSelect = Ui.inputIntFromUser();

            switch (menuSelect){
                case 1:
                    System.out.println("option 1 selected");
                    //"filnavn: " --> til metode i annen klasse. Prøve å åpne fil. Sette opp exceptions  +lese data
                    break;
                case 2:
                    System.out.println("option 2 selected");
                    break;
                case 3:
                    System.out.println("quit");
                    quit = true;
                    break;
                default:
                    System.out.println("invalid choice");
            }

        }while (!quit);



    }




}
