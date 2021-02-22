package fileConnection;

import java.io.*; //BufferedReader, BufferedWriter, FileReader, FileWriter, IOException, PrintWriter ...

public class fileConnection {
    public static PrintWriter writeConnection(String filename) {
        try {
            FileWriter filForbindelse = new FileWriter(filename);
            BufferedWriter skriveBuffer = new BufferedWriter(filForbindelse);
            PrintWriter writer = new PrintWriter(skriveBuffer);
            return writer;
        }catch(IOException e) {return null;}
    } //Metode

    public static BufferedReader readConnection(String filename) {
        try {
            FileReader filForbindelse = new FileReader(filename);
            BufferedReader reader = new BufferedReader(filForbindelse);
            return reader;
        }catch(IOException e){return null;}
    } //metode{

}
