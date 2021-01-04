<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%

		Connection con = null;
        Statement stmt;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentmanagement","root","admin");

        stmt=con.createStatement();
		String id = request.getParameter("id");
		String rollNumber = request.getParameter("rollNumber");	
		String name = request.getParameter("name");
		String stdClass = request.getParameter("class");
				

        stmt.executeUpdate("update student set stdRollNumber ='"+rollNumber+"',stdName='"+name+"',stdClass='"+stdClass+"' WHERE stdId ="+ id);
        stmt.close();
		
		String redirectURL = "viewStudent.jsp";
        response.sendRedirect(redirectURL);

		 
    }catch(Exception e){ out.print(e);}
%>