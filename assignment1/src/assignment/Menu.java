package assignment;
import assignment.dependencies.Ui;
import assignment.dependencies.Ui_fromScanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Menu {
    private Ui Ui;

    public Menu(Ui_fromScanner uiFromScanner) {
        this.Ui = uiFromScanner;
    }

    public void menu()  {
        OpenFile openFile = new OpenFile();
        StoreData storedata = new StoreData();
        ReadClass readClass = new ReadClass();

        boolean quit = false;


         do{

            System.out.print("Select one of the options by typing the corresponding number: " +
                    "\n1. Open file" +
                    "\n2. Get reports" +
                    "\n3. Edit data in file" +
                    "\n4. Export data to file" +
                    "\n5. Exit menu" +
                    "\n\nEnter number: ");

             try{
                 int menuSelect = Ui.inputIntFromUser();

                 switch (menuSelect){
                case 1:
                    testOpenFile(openFile);
                    break;
                case 2:
                    System.out.println("Get reports");
                    String filename = testOpenFile(openFile);
                    readClass.readEverything(filename);
                    int size = storedata.getObjectsSize();
                    System.out.println("Size: " + size);

                    //add/put valgte data rapporter i Array / hashmap el. - kan eksporteres senere
                    break;
                case 3:
                    System.out.println("Edit data selected");
                    break;
                case 4:
                    System.out.println("Export data selected");
                    break;
                case 5:
                    System.out.println("Exiting menu");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

             }catch (InputMismatchException e){ System.out.println("Invalid choice");
                 Ui.inputStringFromUser();
             } catch(NoSuchElementException e) { System.out.println("NoSuchElementException()");
                 Ui.inputStringFromUser();
             } catch(NullPointerException e) { System.out.println("NullPointerException()");
                 Ui.inputStringFromUser();
             } catch (Exception e) { System.out.println("Didn't work");
                 Ui.inputStringFromUser();
             }


        }while (!quit);

    }

    private String testOpenFile(OpenFile openFile) {
        System.out.println("Open file selected");
        //"filnavn: " --> til metode i annen klasse. Prøve å åpne fil. Sette opp exceptions  +lese data
        System.out.println("Please enter filename:");
        String fileName = Ui.inputStringFromUser();
        System.out.println("You entered: "+fileName);
        openFile.openFile(fileName);
        return fileName;
    }

}
