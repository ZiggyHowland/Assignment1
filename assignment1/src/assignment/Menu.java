package assignment;
import assignment.dependencies.Ui;
import assignment.dependencies.Ui_fromScanner;
import assignment.openCSV.OpenCSV;
import assignment.openCSV.OpenCSV_AvailableFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {
    private Ui Ui;

    public Menu(Ui_fromScanner uiFromScanner) {
        this.Ui = uiFromScanner;
    }

    public void menu()  {
        OpenFile openFile = new OpenFile();
        StoreData storedata = new StoreData();
        ReadClass readClass = new ReadClass();
        OpenCSV openCSV = new OpenCSV();
        Scanner scanner = new Scanner(System.in);
        final File f = new File("production/assignment1");

        boolean quit = false;


         do{

            System.out.print("Select one of the options by typing the corresponding number: " +
                    "\n1. Test if file exists and number of lines" +
                    "\n2. Get report for xxxx (total unit cost in Europe?)" +
                    "\n3. Get report for xxxx (total unit cost in Middle East?)" +
                    "\n4. Get report for xxxx (Average unit cost in Europe?)" +
                    "\n5. Edit data in file" +
                    "\n6. Export data to file" +
                    "\n7. Read everything in file" +
                    "\n8. Read only specific line in file" +
                    "\n9. Write to file" +
                    "\n10. Exit menu" +
                    "\n\nEnter number: ");

             try{
                 int menuSelect = Ui.inputIntFromUser();

                 switch (menuSelect){
                     case 1:
                         System.out.println("Test if file exists and number of lines");
                         testOpenFile(openFile);
                         break;
                    case 2:
                        System.out.println("Get report for xxxx (total unit cost in Europe?)");
                        String filename = testOpenFile(openFile);
                        readClass.readEverything(filename);
                        int size = storedata.getObjectsSize();
                        System.out.println("Size: " + size);
                        //add/put valgte data rapporter i Array / hashmap el. - kan eksporteres senere
                        break;
                    case 3:
                        System.out.println("Get report for xxxx (total unit cost in Middle East?)");
                        break;
                    case 4:
                        System.out.println("Get report for xxxx (Average unit cost in Europe?)");
                        break;
                    case 5:
                        System.out.println("Edit data in file");
                        break;
                    case 6:
                        System.out.println("Export data to file");
                         break;
                    case 7:
                        System.out.println("Read everything in file");
                        OpenCSV_AvailableFiles.printAvailableFiles(f);
                        OpenCSV.readEverythingWithOpenCSV(testOpenFile(openFile));
                         break;
                    case 8:
                        System.out.println("Read only specific line in file");
                        break;
                    case 9:
                        System.out.println("Write to file");
                        OpenCSV_AvailableFiles.printAvailableFiles(f);
                        openCSV.writeToFileWithStringsOpenCSV(testOpenFile(openFile));
                        break;
                    case 10:
                        System.out.println("Exiting menu...");
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
