package assignment.dependencies;

import java.util.Scanner;

public class Ui_fromScanner implements Ui{

//public class Ui_fromScanner implements Ui {

    private Scanner inputFromUser = new Scanner(System.in);

    @Override
    public String inputStringFromUser(){
        return inputFromUser.next();
    }

    @Override
    public int inputIntFromUser() {
        return inputFromUser.nextInt();
    }

}
