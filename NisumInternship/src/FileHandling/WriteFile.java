package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        String fileName = input.nextLine() +".txt";

        try {
            File myFile = new File(fileName);

            System.out.println("ENTER TEXT : ");
            String textInput = input.nextLine();
            FileWriter writeFile;

            if(myFile.createNewFile()){
                System.out.println("FILE CREATED");
                 writeFile = new FileWriter(fileName);

            }else {
                 writeFile = new FileWriter(fileName,true);
                System.out.println("File Updated");
            }
            writeFile.write(textInput);
            writeFile.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
