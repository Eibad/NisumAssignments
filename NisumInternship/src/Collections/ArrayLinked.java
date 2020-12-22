package Collections;

import org.omg.PortableInterceptor.INACTIVE;

import java.sql.Array;
import java.util.*;

public class ArrayLinked {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> integerList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        List<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        for(int i =0; i<50000 ; i++){
            integerList.add(random.nextInt(100));
            integerLinkedList.add(random.nextInt(100));
        }
        Long time = System.currentTimeMillis();
        for(int i = 0; i<integerList.size(); i++){
            if(i == integerList.size()-1){
                System.out.println(integerList.get(i));
                System.out.println("Array List time = "+(time - System.currentTimeMillis())+" ms");
            }
        }

        time = System.currentTimeMillis();
        for(int i = 0; i<integerLinkedList.size(); i++){
            if(i == integerLinkedList.size()-1){
                System.out.println(integerLinkedList.get(i));
                System.out.println("time = "+(time - System.currentTimeMillis() +" ms"));
            }
        }




    }
}
