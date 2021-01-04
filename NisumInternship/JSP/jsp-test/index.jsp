<html>  
<body>  
<%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>

<%	for(int i =0; i< 5; i++){
		out.print(i);
	}
 %>  
 
<%!
	String makeItLower(String word){
		return word.toLowerCase();
	}
 %>
 
<%= makeItLower("DaaTTA")%> 
</body>  
</html>  