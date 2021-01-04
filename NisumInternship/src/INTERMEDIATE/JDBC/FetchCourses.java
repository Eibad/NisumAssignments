package INTERMEDIATE.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FetchCourses {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Roll Number of Student");
        String rollNumber = input.nextLine();

        List<Student> studentList = new ArrayList<>();
        Student getStudent = new Student();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","admin");
            Statement statement = con.createStatement();
            System.out.println(rollNumber);
            ResultSet resultStudent = statement.executeQuery("select * from student where stdRollNumber = "+rollNumber);

            if(true){
            while (resultStudent.next()){
                getStudent.setId(resultStudent.getInt("stdId"));
                getStudent.setRollNumber(resultStudent.getString("stdRollNumber"));
                 getStudent.setClassStd(resultStudent.getString("stdClass"));
                 getStudent.setName(resultStudent.getString("stdName"));
            }
                System.out.println(getStudent);

                ResultSet resultStudentCourse = statement.executeQuery("select course.courseName From course " +
                        "JOIN student_course on course.courseId = student_course.courseId " +
                        "Join student on student.stdId = student_course.stdId " +
                        "where student_course.stdId = " + getStudent.getId());


                if (resultStudentCourse == null) {
                    System.out.println("NO COURSES FOUND");
                }

                else {
                    while (resultStudentCourse.next()) {
                        System.out.println(resultStudentCourse.getString(1));
                    }
                }
            }
            else{
                System.out.println("Student NOT FOUND");
            }




//            System.out.println(getStudent.getString(1));;
//            ResultSet resultSet = statement.executeQuery("select * from student_course where stdId = ");

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error in data");
//            e.printStackTrace();
        }
    }
}
