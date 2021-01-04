
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
        Statement stmt;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentmanagement","root","admin");

        stmt=con.createStatement();

        ResultSet rs=stmt.executeQuery("select * from student");
		
		int serial = 1;
%>

	<a href="addForm.jsp">ADD STUDENT</a>
	
	<table style="width:100%">
	<tr>
    <th>S.No</th>
	<th>Roll Number</th>
    <th>Name</th> 
	<th>Class</th>
	<th>Action</th>
    </tr>
<%	
		 while(rs.next()){
			 %>

	<tr>
	<td><%=serial ++ %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3)%></td>
	<td><%=rs.getString(4)%></td>
	<td><a href="editStudentForm.jsp?id=<%=rs.getInt("stdId")%>">Edit</a>
	<a href="deleteStudent.jsp?id=<%=rs.getInt("stdId")%>">Delete</a></td>
    </tr>
	
			<%
		 }

		
		
    }catch(Exception e){ out.print(e);}

%>

</table>
