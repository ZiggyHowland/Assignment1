package assignment.openCSV;

import assignment.OpenFile;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static assignment.OpenFile.getFilepath;

public class OpenCSV_changeData {
    public static void editDataWithOpenCSV(String fileToUpdate, String replace, int row, int col) throws IOException {
        try {
            File inputFile = new File(OpenFile.getFilePathEdit()+fileToUpdate);
            // Read existing file
            CSVReader reader = new CSVReader(new FileReader(inputFile));
            List<String[]> csvBody = reader.readAll();
            // get CSV row column  and replace with by using row and column
            csvBody.get(row)[col] = replace;
            reader.close();

            // Write to CSV file which is open
            CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
            writer.writeAll(csvBody);
            writer.flush();
            writer.close();

            System.out.println("Data is successfully edited");
        } catch (IOException | CsvException e) { throw new IOException();}
    }
}
