package JavaBasics;

public class Student {

    private String rollNumber;
    private String name;
    private String grade;
    private String age;

    public Student() {
    }

    public Student(String rollNumber, String name, String grade, String age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber='" + rollNumber + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    //lombok
}
