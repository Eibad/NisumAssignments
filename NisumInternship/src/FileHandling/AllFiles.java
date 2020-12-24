package FileHandling;

import java.io.File;

public class AllFiles {

    public static void main(String[] args) {
        String path = "D:/Eibad/Intern";
        File file = new File(path);
        File[] listFiles = file.listFiles();

        for (File item:listFiles
             ) {
            System.out.println(item.getName());
        }
    }
}
