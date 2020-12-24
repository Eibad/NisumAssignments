package Collections.Comparator;

import java.util.Comparator;

public class SortStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.getName().equalsIgnoreCase(s2.getName())) {
            return s1.getAge().compareTo(s2.getAge());
        } else {
            return s1.getName().compareToIgnoreCase(s2.getName());
        }
    }
}
