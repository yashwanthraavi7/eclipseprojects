<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String name = request.getParameter("userName");
	int age = Integer.parseInt(request.getParameter("age"));
	%>
	
	<p>	Hello
		<%=name%></p>
	
	<br>
	<%
	if (age >= 18) {
		out.write("You can vote!");
	} else {
		out.write("You cannot vote!");
	}
	%>

</body>
</html>