package Collections.Comparator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student eibad = new Student(1,"Ali","22");
        Student ali = new Student(2,"Ali","1");
        Student rahim = new Student(3,"Rahim","21");
        Student faraz = new Student(4,"ali","1");
        Student osama = new Student(5,"Osama","24");
//        studentList.add(Arrays.asList(eibad,ali,rahim));

        List<Student> studentList = new ArrayList<Student>(Arrays.asList(eibad,ali,rahim,faraz,osama));

        for (Student student: studentList
             ) {
            System.out.println(studentList);
        }

//        Collections.sort(studentList,new SortStudentComparator());


        //Sort on Name

        //by lamda expression
//        Collections.sort(studentList,(o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
//        Collections.sort(studentList,Comparator.comparing(Student::getName));

        List<Student> sortedStudent= studentList.stream().sorted(new SortStudentComparator()).collect(Collectors.toList());
        List <Student> studentAge = studentList.stream().filter(student1 -> Integer.parseInt(student1.getAge())>10).collect(Collectors.toList());
        System.out.println("_____AFTER SORTING________");
        printArray(studentList);

        System.out.println("_____STUDENT AGE > 10________");
        printArray(studentAge);


        System.out.println("_____SORT USING STREAM________");
        printArray(sortedStudent);


    }
//Integer.parseInt(student1.getAge())>10
    static void printArray(List<Student> objectList){

        for (Student student: objectList
             ) {
            System.out.println(student);
        }
    }
}
