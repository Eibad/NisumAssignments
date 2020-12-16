package JavaBasics;

public class Main {
    public static void main(String[] args) {

        Student eibad = new Student("0001","Eibad","I","20");
        System.out.println(eibad);

        Student ali = new Student();
        ali.setName("ali");
        ali.setAge("19");
        ali.setGrade("II");
        ali.setRollNumber("0002");

        System.out.println(ali);

    }
}
