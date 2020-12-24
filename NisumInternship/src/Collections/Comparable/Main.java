package Collections.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Student eibad = new Student(1,"Ali","22");
    Student ali = new Student(2,"Ali","11");
    Student rahim = new Student(3,"Rahim","21");
    Student faraz = new Student(4,"ali","1");
    Student osama = new Student(5,"Osama","24");
//        studentList.add(Arrays.asList(eibad,ali,rahim));

    List<Student> studentList = new ArrayList<Student>(Arrays.asList(eibad,ali,rahim,faraz,osama));

        for (Student student: studentList
             ) {
        System.out.println(studentList);
    }

        Collections.sort(studentList);

        System.out.println("_____AFTER SORTING________");
        for (
    Student student: studentList
             ) {
        System.out.println(studentList);
    }

        System.out.println(osama.compareTo(ali));

}

}
