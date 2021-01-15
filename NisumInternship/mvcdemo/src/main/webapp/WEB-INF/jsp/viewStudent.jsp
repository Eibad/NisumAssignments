<%--
  Created by IntelliJ IDEA.
  User: eali
  Date: 14/01/2021
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>
<head>
    <title>Title</title>
</head>

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

<body>

<a href="index.jsp">ADD STUDENT</a>
<table style="width:100%">
    <tr>
        <th>S.No</th>
        <th>Roll Number</th>
        <th>Name</th>
        <th>Class</th>
        <th>Action</th>
    </tr>
    <C:set var="count" value="0" scope="page" />
    <C:forEach var="student" items="${studentList}">

    <tr>
        <C:set var="count" value="${count + 1}" scope="page"/>
        <td>${count}</td>
        <td>${student.rollNumber}</td>
        <td>${student.name}</td>
        <td>${student.classStd}</td>
        <td><a href="updatestudent/${student.id}">Edit</a>
            <a href="deletestudent/${student.id}">Delete</a></td>
    </tr>
    </C:forEach>
</table>

<form:form >
    First name: <form:input path="name" />

    <br><br>
    <input type="submit" value="Submit" />
</form:form>


</body>
</html>
