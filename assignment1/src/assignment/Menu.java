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
    Scanner scanner = new Scanner(System.in);

    public Menu(Ui_fromScanner uiFromScanner) {
        this.Ui = uiFromScanner;
    }

    public void menu()  {
        OpenFile openFile = new OpenFile();
        StoreData storedata = new StoreData();
        //ReadClass readClass = new ReadClass();
        OpenCSV openCSV = new OpenCSV();
        final File fFilePath = new File(OpenFile.getFilepath());
        final File fExport = new File(OpenFile.getFilepathExport());
        final File fDelete = new File(OpenFile.getFilePathDelete());

        boolean quit = false;


         do{
             System.out.println(" ");
            System.out.print("Select one of the options by typing the corresponding number: \n" +
                    "\n1. Test if file exists and number of lines" +
                    "\n2. Get reports overall." +
                    "\n3. View reports overall. " +
                    "\n4. View reports per region and country " +
                    "\n5. Edit data in file" +
                    "\n6. Export data to file" +
                    "\n7. Read everything in file" +
                    "\n8. Read only specific line in file" +
                    "\n9. Write to file" +
                    "\n10. Save everything from file" +
                    "\n11. Delete file" +
                    "\n12. Exit menu" +
                    "\n\nEnter number: ");


             try{
                 int menuSelect = Ui.inputIntFromUser();

                 switch (menuSelect){
                     case 1:
                         System.out.println("Test if file exists and number of lines");
                         OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                         testOpenFile(openFile);
                         break;
                    case 2:
                        System.out.println("Get reports overall");
                        String filename = testOpenFile(openFile);
                        //readClass.readEverything(filename);
                        int size = storedata.getObjectsSize();
                        System.out.println("Size: " + size);
                        //add/put valgte data rapporter i Array / hashmap el. - kan eksporteres senere
                        break;
                    case 3:
                        System.out.println("View reports overall");
                        String report = "TEST - link / method to actual report here";
                        //addThisReportToExportFile(openCSV, report);
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        storedata = OpenCSV.readAndSaveEverythingWithOpenCSV(testOpenFile(openFile));
                        Reports.mainReport(storedata);
                        break;
                     case 4:
                        System.out.println("View reports per region and country");
                        String report2 = null;
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        storedata = OpenCSV.readAndSaveEverythingWithOpenCSV(testOpenFile(openFile));
                        Reports.salesPerRegion(storedata);
                        //addThisReportToExportFile(openCSV, report2);
                        break;
                    case 5:
                        System.out.println("Edit data in file");
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        break;
                    case 6:
                        System.out.println(
                                "\n1. View current data set to be exported" +
                                        "\n2. Export data to file" +
                                        "\n3. Exit menu");
                        int selectExportMenu = Ui.inputIntFromUser();

                        if (selectExportMenu == 1) {
                            System.out.println(openCSV.getTheRowsAsString());
                            break;
                        }
                        if (selectExportMenu == 2) {
                            System.out.println("Export data to file");
                            System.out.print("Enter filename (remember .csv): ");
                            String filenameForExport = Ui.inputStringFromUser();
                            openCSV.exportChosenDataToFile(filenameForExport);
                            break;
                        }
                    case 7:
                        System.out.println("Read everything in file");
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        OpenCSV.readEverythingWithOpenCSV(testOpenFile(openFile));
                         break;
                    case 8:
                        System.out.println("Read only specific line in file");
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        OpenCSV.readOnlySpecificLines(testOpenFile(openFile), getRow());
                        break;
                    case 9:
                        System.out.println("Write to file");
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        openCSV.writeToFileWithStringsOpenCSV(testOpenFile(openFile));
                        break;
                     case 10:
                        System.out.println("Save everything from file");
                        OpenCSV_AvailableFiles.printAvailableFiles(fFilePath);
                        storedata = OpenCSV.readAndSaveEverythingWithOpenCSV(testOpenFile(openFile));
                        System.out.println(storedata.getObjectsSize());
                        System.out.printf("Omsetning %f5", Reports.sumTotalRevenue(storedata));
                        break;
                    case 11:
                        System.out.println("Delete file\n");
                        OpenCSV_AvailableFiles.printAvailableFiles(fDelete);
                        System.out.println("Filename to delete:");
                        String filenameToDelete = scanner.nextLine();
                        DeleteFile.deleteFileMethod(filenameToDelete);
                        break;
                    case 12:
                        System.out.println("Exiting menu...");
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid choice");
            }

             }catch (InputMismatchException e){ System.out.println("Invalid choice\n");
                 Ui.inputStringFromUser();
             } catch(NoSuchElementException e) { System.out.println("NoSuchElementException()\n");
                 Ui.inputStringFromUser();
             } catch(NullPointerException e) { System.out.println("NullPointerException()\n");
                 Ui.inputStringFromUser();
             } catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println("File cointains different length per row, and is not possible to use\n"); //Ulik antall kolonner i radene, og kan derfor ikke opprette Object objekt
             } catch (NumberFormatException e) {
                 System.out.println("File cointains wrong format, is not possible to use\n"); //Feil i format
             } catch (FileNotFoundException exception) { System.out.println("File doesn't exist\n"); //FileNotFoundException extends IOException
             } catch (IOException e) { System.out.println("Invalid permissions\n");
             } catch (Exception e) { System.out.println("Didn't work\n");
             }


         }while (!quit);

    }

    private void addThisReportToExportFile(OpenCSV openCSV, String report) {
        if (report != null){
            boolean addToExport;
            while (addToExport = true){
                System.out.println("Do you want to add this report to file for export?" +
                        "\nYes/No: ");
                String addToExport2 = Ui.inputStringFromUser().toLowerCase();
                if (addToExport2.equals("yes")) {
                    openCSV.addStringToExport(report);
                    System.out.println("Printing report to export.");
                    break;
                }
                if (addToExport2.equals("no")) {
                    break;
                } else
                    System.out.println("Invalid input");
            }

        }
    }


    private String testOpenFile(OpenFile openFile) throws IOException {
        try {
            System.out.println("Open file selected");
            //"filnavn: " --> til metode i annen klasse. Prøve å åpne fil. Sette opp exceptions  +lese data
            System.out.println("Please enter filename:");
            String fileName = Ui.inputStringFromUser();
            System.out.println("You entered: " + fileName);
            openFile.checkIfFileExistAndCountNumberOfLines(fileName);
            return fileName;
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public int getRow() {
        System.out.println("\nPlease enter row you want to read:");
        int row = scanner.nextInt();
        scanner.nextLine();
        return row-1;
    }

}
