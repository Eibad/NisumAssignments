package Z_Extra;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5);

        for (int item : number
             ){
            System.out.println(item);

        }

        //square of number using MAP
        List<Integer>square = number.stream().map(x->x*x).collect(Collectors.toList());

        List<String> numberString = Arrays.asList("aa","za","sc","cc");


        //find string starts with 2 using FILTER
        List<String> find = numberString.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());

        for (int item: square
             ) {
            System.out.println(item);
        }


        System.out.println("STREAM MAP");
        for (String item: find
        ) {
            System.out.println(item);
        }


        //sorting
        System.out.println("SORTING");
        List<String> sort = numberString.stream().sorted().collect(Collectors.toList());
        for (String item: sort
             ) {
            System.out.println(item);
        }


        //Strem PAralle

        List<String> stringList = new ArrayList<String>();
        int i =0;
        while (i < 100){
            stringList.add("AAAAAAAAAA");
            i++;
        }

        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        System.out.println(stringList.stream().filter(s->s.startsWith("A")).collect(Collectors.toList()));
        System.out.println("Time"+(t2-t1));

        t1 = System.currentTimeMillis();
        t2 = System.currentTimeMillis();
        System.out.println(stringList.parallelStream().filter(s->s.startsWith("A")).collect(Collectors.toList()));
        System.out.println("Time" +(t2-t1));

    }
}
