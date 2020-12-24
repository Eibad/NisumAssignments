package INTERMEDIATE.JDBC;

import java.sql.*;

public class FetchRecord {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentmanagement","root","admin");

        stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student");
        while(rs.next())
            System.out.println(rs.getInt("stdId")+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));

    }catch(Exception e){ System.out.println(e);}
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
