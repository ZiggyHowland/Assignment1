package assignment.openCSV;

import java.io.File;

public class OpenCSV_AvailableFiles {
    public static void printAvailableFiles(File f) {
        String[] files = f.list();
        System.out.println("Available files:");
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
