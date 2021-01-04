
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%

Connection con = null;
        Statement statement;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentmanagement","root","admin");

		String id = request.getParameter("id");					
        statement=con.createStatement();

    				
		statement.executeUpdate("DELETE FROM student WHERE stdId="+id);

         statement.close();
		
		  String redirectURL = "viewStudent.jsp";
        response.sendRedirect(redirectURL);

		 

		
		
    }catch(Exception e){ out.print(e);}

%>
