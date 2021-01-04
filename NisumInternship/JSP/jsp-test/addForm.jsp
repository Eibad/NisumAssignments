<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>


<html>  
<body>  
<h1><a href="viewStudent.jsp">View Student...</a></h1>

<form method="post" action="addUser.jsp">
<table>
	<tr>
    <th>Roll Number</th>
	<th><input type="text" name="rollNumber" ></th>
	</tr>
	<tr>
    <th>Name</th> 
	<th><input type="text" name="name" ></th>
    </tr>
	<tr>
	<th>Class</th>
	<th><input type="text" name="class" ></th>
    </tr>
	<tr>
	<th></th>
	<th>
	<input type="submit" value="submit"></th>
	</tr>
	
	
	</table>
	</form>
</body>  
</html>  