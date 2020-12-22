package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraySearch {

    public static void main(String[] args) {


        Integer searchNumber = 2;
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);



        System.out.println(arrayList.get(6));
        System.out.println(arrayList.contains(6));
        if(arrayList.indexOf(searchNumber)>=0){
            System.out.println("Index of "+searchNumber+" is : "+arrayList.indexOf(searchNumber));
        }
        else {
            System.out.println("Number Not Exist");
        }
        System.out.println(arrayList.indexOf(62));

        for (Integer item: arrayList
             ) {
//            System.out.println(item);
        }
    }
}
