package assignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteFile {
    public static void deleteFileMethod(String filename) throws IOException {
        /*File file = new File(OpenFile.getFilePathDelete()+filename);
        if(file.delete()) System.out.println("File is deleted");
        else System.out.println("Failed to delete file");
        }
    } */
        try {
            Files.deleteIfExists(Paths.get(OpenFile.getFilePathDelete()+filename)); }
        //catch(NoSuchFileException e) { throw new NoSuchFileException(String OpenFile.getFilePathDelete()+filename); }
        //catch(DirectoryNotEmptyException e) { throw new DirectoryNotEmptyException(); }
        catch(IOException e) { throw new IOException(); }
        System.out.println("Deletion successful.");
    }
}
