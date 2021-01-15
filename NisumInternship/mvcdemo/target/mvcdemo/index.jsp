<html>
<body>

<%--<h1>STudent Form</h1>--%>
<%--<form action="add">--%>
<%--    <input type="text" name="t1">--%>
<%--    <input type="text" name="t2">--%>
<%--    <input type="submit" >--%>
<%--</form>--%>


<h1><a href="viewstudent">View Student...</a></h1>

<form method="post" action="addstudent">
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
            <th><input type="text" name="classStd" ></th>
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
