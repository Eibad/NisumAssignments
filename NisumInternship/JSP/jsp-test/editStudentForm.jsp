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

        ResultSet rs=stmt.executeQuery("select * from student where stdId="+id);
		%>
<%
		 while(rs.next()){
			 %>
		

<html>  
<body>  
<h1><a href="hello">CLICK HERE...</a></h1>

<form method="post" action="updateStudent.jsp?id=<%=rs.getInt("stdId") %>">
<table>
	<tr>
    <th>Roll Number</th>
	<th><input type="text" name="rollNumber" value="<%= rs.getString("stdRollNumber")%>" ></th>
	</tr>
	<tr>
    <th>Name</th> 
	<th><input type="text" name="name" value="<%= rs.getString("stdName")%>"></th>
    </tr>
	<tr>
	<th>Class</th>
	<th><input type="text" name="class" value="<%= rs.getString("stdClass")%>"></th>
    </tr>
	<tr>
	<th></th>
	<th>
	<input type="submit" value="Update"></th>
	</tr>
	
	</table>
	</form>
	
	<%
		 }

		
		
    }catch(Exception e){ out.print(e);}

%>
</body>  
</html>  