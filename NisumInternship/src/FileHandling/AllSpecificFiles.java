package FileHandling;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.WildcardType;

public class AllSpecificFiles {

    public static void main(String[] args) {

        String path = "D:/Eibad/Intern";
        String format = ".txt";
        File file = new File(path);

        File[] listFiles = file.listFiles((dir, name) -> name.endsWith(format));
        for (File item: listFiles
             ) {
            System.out.println(item.getName());
        }
    }
}
