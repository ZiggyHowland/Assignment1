package assignment.openCSV;

import java.io.File;

public class OpenCSV_AvailableFiles {
    public static void printAvailableFiles(File f) {
        String[] files = f.list();
        System.out.println("Available files:");
        for (int i = 0; i < files.length; i++) {
            String word = files[i];
            if(word.substring(word.length()-3).equals("csv")) System.out.println(files[i]);
            //System.out.println(files[i]);
        }
    }
}
