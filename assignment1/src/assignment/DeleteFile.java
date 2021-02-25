package assignment;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteFile {
    public static void deleteFileMethod(String filename) throws IOException {
        try {
            Files.deleteIfExists(Paths.get(OpenFile.getFilepath()+filename));
        } catch(NoSuchFileException e) {
            throw new NoSuchFileException(null);
            //System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e) {
            throw new DirectoryNotEmptyException(null);
            //System.out.println("Directory is not empty.");
        }
        catch(IOException e) {
            throw new IOException();
        }
        System.out.println("Deletion successful.");
    }
}

