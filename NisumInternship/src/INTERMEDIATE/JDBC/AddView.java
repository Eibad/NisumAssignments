package INTERMEDIATE.JDBC;


import java.sql.*;
import java.util.Scanner;

public class AddView {

    public static void main(String[] args) {

        Connection con = null;
        Statement statement;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name of Student : ");
        String name = input.nextLine();

        System.out.println("Enter Student Roll Number : ");
        String rollNumber = input.nextLine();

        System.out.println("Enter Class of Student : ");
        String classStd = input.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","admin");

            statement = con.createStatement();

            Student student = new Student(rollNumber,name,classStd);
            addStudent(con,student);
            viewAllStudent(con);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    public static void viewAllStudent(Connection con){
        try {
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("select * from student");

            while (result.next()){
                System.out.println(result.getInt("stdId")+"  "+result.getString(2)+"  "+result.getString(3)+"  "+result.getString(4));
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void addStudent(Connection con,Student student){
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("Insert into student (stdRollNumber,stdName,stdClass) " +
                    "VALUES('"+student.getRollNumber()+"','"+student.getName()+"','"+student.getClassStd()+"')");


            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
