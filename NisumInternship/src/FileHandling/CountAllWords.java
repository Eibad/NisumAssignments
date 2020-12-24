package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountAllWords {
    public static void main(String[] args) {
        try {
            String fileName = "File_Name.txt";
            File file = new File(fileName);

            Scanner scanner = new Scanner(file);

            Map<String,Integer> map = new HashMap<>();


            while (scanner.hasNext()){
                String currentWord = scanner.next();
                if(map.containsKey(currentWord)){
                    map.put(currentWord,(map.get(currentWord))+1);
                }
                else {
                    map.put(currentWord,1);
                }
            }




            for (String s: map.keySet()
            ) {
                System.out.println(s+"\t: "+map.get(s));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
