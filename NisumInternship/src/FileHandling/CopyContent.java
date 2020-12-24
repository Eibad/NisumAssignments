package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyContent {
    public static void main(String[] args) {

        try {
        String fileName = "File_Name.txt";
        String newFileName = "File_Name_2.txt";


        File file = new File(fileName);
        File existFile = new File(newFileName);

        if(existFile.createNewFile()) {
            Files.copy(file.toPath(), existFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
