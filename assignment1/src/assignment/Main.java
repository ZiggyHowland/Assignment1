package assignment;

import assignment.dependencies.Ui_fromScanner;


public class Main {


    public static void main(String[] args) {

        Menu instanciateMenu = new Menu();
        instanciateMenu.menu(new Ui_fromScanner());

    }

}
