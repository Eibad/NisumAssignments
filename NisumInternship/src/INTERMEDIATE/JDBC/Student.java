package INTERMEDIATE.JDBC;

public class Student {

    private String rollNumber;
    private String name;
    private String classStd;

    public Student(String rollNumber, String name, String classStd) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.classStd = classStd;
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

    public String getClassStd() {
        return classStd;
    }

    public void setClassStd(String classStd) {
        this.classStd = classStd;
    }
}
