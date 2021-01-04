
<style>

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

th, td {
  padding: 15px;
  text-align: center;
}
</style>


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

		String rollNumber = request.getParameter("rollNumber");	
		String name = request.getParameter("name");
		String stdClass = request.getParameter("class");
		
		if((rollNumber != "" && name != "" && stdClass != "")){	
			statement=con.createStatement();

			statement.executeUpdate("Insert into student (stdRollNumber,stdName,stdClass) " +
						"VALUES('"+rollNumber+"','"+name+"','"+stdClass+"')");

			 statement.close();
			 
		  String redirectURL = "viewStudent.jsp";
        response.sendRedirect(redirectURL);
		}
		else{
		
		  String redirectURL = "AddStudent.jsp";
        response.sendRedirect(redirectURL);	
			
		}
		

		 

		
		
    }catch(Exception e){ out.print(e);}

%>
