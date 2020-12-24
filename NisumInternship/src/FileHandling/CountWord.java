package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {

        try {
        String fileName = "File_Name.txt";
        String word = "java";
        int count = 0;
        File file = new File(fileName);

        Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                String currentWord = scanner.next();
                System.out.println(currentWord);
                if(currentWord.equalsIgnoreCase(word)){
                    count++;

                }
            }

            System.out.println("Word Count : "+count);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}